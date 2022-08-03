package dh.meli.reviewtests.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dh.meli.reviewtests.exception.PersonNotFoundException;
import dh.meli.reviewtests.model.Person;
import dh.meli.reviewtests.service.PersonService;
import dh.meli.reviewtests.util.GeneratePerson;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PersonController.class)
public class PersonControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper; // Json para String

    @MockBean
    private PersonService service;

    @Test
    public void create_insertNewPerson_whenNewPerson() throws Exception {
        BDDMockito.given(service.save(ArgumentMatchers.any(Person.class)))
                .willAnswer((invocation)->invocation.getArgument(0));

        Person person = GeneratePerson.newPerson1ToSave();

        ResultActions response =  mockMvc.perform(post("/person")
                .content(objectMapper.writeValueAsString(person))
                .contentType(MediaType.APPLICATION_JSON)
            );

        response.andExpect(status().isCreated())
                .andExpect(jsonPath("$.name", CoreMatchers.is(person.getName())));
    }

    @Test
    public void getAll_returnListOfPerson_whenSuccess() throws Exception {
        List<Person> list = new ArrayList<>();
        list.add(GeneratePerson.validPerson1());
        list.add(GeneratePerson.validPerson2());

        BDDMockito.when(service.getAll()).thenReturn(list);

        ResultActions response = mockMvc.perform(get("/person")
                .contentType(MediaType.APPLICATION_JSON));

        response.andExpect(status().isOk())
                .andExpect(jsonPath("$.size()",
                        CoreMatchers.is(list.size())))
                .andExpect(jsonPath("$[0].name",
                        CoreMatchers.is(GeneratePerson.validPerson1().getName())));
    }

    @Test
    public void getById_returnPerson_whenIdExist() throws Exception {
        Person person = GeneratePerson.validPerson1();

        BDDMockito.when(service.getById(anyLong()))
                .thenReturn(Optional.of(person));

        ResultActions response = mockMvc.perform(get("/person/{id}", person.getId())
                .contentType(MediaType.APPLICATION_JSON));

        response.andExpect(status().isOk())
                .andExpect(jsonPath("$.name",
                        CoreMatchers.is(person.getName())));

    }

    @Test
    public void getById_returnNotFound_whenIdNotExist() throws Exception {
        Person person = GeneratePerson.validPerson1();

        BDDMockito.when(service.getById(anyLong()))
                .thenReturn(Optional.empty());

        ResultActions response = mockMvc.perform(get("/person/{id}", person.getId())
                .contentType(MediaType.APPLICATION_JSON));

        response.andExpect(status().isNotFound());
    }

    @Test
    public void update_returnUpdatedPerson_whenPersonExist() throws Exception {
        Person person = GeneratePerson.validPerson1();

        BDDMockito.given(service.update(ArgumentMatchers.any(Person.class)))
                .willAnswer((invocation) -> invocation.getArgument(0));

        person.setName("Novo Nome");
        ResultActions response = mockMvc.perform(put("/person")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(person)));

        response.andExpect(status().isOk())
                .andExpect(jsonPath("$.name",
                        CoreMatchers.is(person.getName())));
    }

    @Test
    public void update_returnNotFound_whenPersonNotExist() throws Exception {
        final long idNotExist = 999;
        Person person = GeneratePerson.newPerson1ToSave();
        person.setId(idNotExist);

        BDDMockito.given(service.update(ArgumentMatchers.any(Person.class)))
                .willThrow(new PersonNotFoundException("Id not found"));

        assertThatCode( ()-> {
            ResultActions response = mockMvc.perform(put("/person")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(objectMapper.writeValueAsString(person)));
        }).hasCause(new PersonNotFoundException("Id not found"));
    }

    @Test
    public void delete_returnHttpNoContent_whenPersonExist() throws Exception {
        BDDMockito.willDoNothing().given(service).delete(anyLong());

        ResultActions response =  mockMvc.perform(delete("/person/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON));

        response.andExpect(status().isNoContent());
    }

    @Test
    public void delete_returnHttpNotFound_whenPersonNotExist() throws Exception {
        final long idNotExist = 999;

        BDDMockito.doThrow(new PersonNotFoundException("Id not found"))
                .when(service).delete(anyLong());

        assertThatCode( ()-> {
            ResultActions response = mockMvc.perform(delete("/person/{id}", idNotExist)
                    .contentType(MediaType.APPLICATION_JSON));
        }).hasCause(new PersonNotFoundException("Id not found"));
    }

}





package dh.meli.reviewtests.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import dh.meli.reviewtests.exception.PersonNotFoundException;
import dh.meli.reviewtests.model.Person;
import dh.meli.reviewtests.repository.PersonRepository;
import dh.meli.reviewtests.util.GeneratePerson;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class PersonControllerITTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setup() {
        personRepository.deleteAll();
    }

    @Test
    public void create_insertNewPerson_whenNewPerson() throws Exception {
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

        personRepository.saveAll(list);

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
        Person person = GeneratePerson.newPerson1ToSave();

        Person personSaved = personRepository.save(person);

        ResultActions response = mockMvc.perform(get("/person/{id}", personSaved.getId())
                .contentType(MediaType.APPLICATION_JSON));

        response.andExpect(status().isOk())
                .andExpect(jsonPath("$.name",
                        CoreMatchers.is(personSaved.getName())));

    }

    @Test
    public void getById_returnNotFound_whenIdNotExist() throws Exception {
        Person person = GeneratePerson.validPerson1();

        ResultActions response = mockMvc.perform(get("/person/{id}", person.getId())
                .contentType(MediaType.APPLICATION_JSON));

        response.andExpect(status().isNotFound());
    }

    @Test
    public void update_returnUpdatedPerson_whenPersonExist() throws Exception {
        Person person = GeneratePerson.newPerson1ToSave();
        Person personSaved = personRepository.save(person);

        personSaved.setName("Novo Nome");
        ResultActions response = mockMvc.perform(put("/person")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(personSaved)));

        response.andExpect(status().isOk())
                .andExpect(jsonPath("$.name",
                        CoreMatchers.is(personSaved.getName())));
    }

    @Test
    public void update_returnNotFound_whenPersonNotExist() throws Exception {
        final long idNotExist = 999;
        Person person = GeneratePerson.newPerson1ToSave();
        person.setId(idNotExist);


        assertThatCode( ()-> {
            ResultActions response = mockMvc.perform(put("/person")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(objectMapper.writeValueAsString(person)));
        }).hasCause(new PersonNotFoundException("Person não existe"));
    }

    @Test
    public void delete_returnHttpNoContent_whenPersonExist() throws Exception {
        Person person = GeneratePerson.newPerson1ToSave();
        Person personSaved = personRepository.save(person);


        ResultActions response =  mockMvc.perform(delete("/person/{id}", personSaved.getId())
                .contentType(MediaType.APPLICATION_JSON));

        response.andExpect(status().isNoContent());
    }


    @Test
    public void delete_returnHttpNotFound_whenPersonNotExist() throws Exception {
        final long idNotExist = 999;

        assertThatCode( ()-> {
            ResultActions response = mockMvc.perform(delete("/person/{id}", idNotExist)
                    .contentType(MediaType.APPLICATION_JSON));
        }).hasCause(new PersonNotFoundException("Id not found"));
    }

}

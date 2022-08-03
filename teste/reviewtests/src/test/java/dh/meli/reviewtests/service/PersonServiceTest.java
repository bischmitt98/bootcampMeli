package dh.meli.reviewtests.service;

import dh.meli.reviewtests.exception.InvalidPersonParam;
import dh.meli.reviewtests.exception.PersonNotFoundException;
import dh.meli.reviewtests.model.Person;
import dh.meli.reviewtests.repository.PersonRepository;
import dh.meli.reviewtests.util.GeneratePerson;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @InjectMocks
    private PersonService personService;

    @Mock
    private PersonRepository personRepository;

    @Test
    public void save_savePerson_whenValidNewPerson() {
        BDDMockito.when(personRepository.save(ArgumentMatchers.any(Person.class)))
                .thenReturn(GeneratePerson.validPerson1());

        Person person = GeneratePerson.newPerson1ToSave();

        Person personSaved = personService.save(person); // ação

        assertThat(personSaved).isNotNull();
        assertThat(personSaved.getId()).isPositive();
        assertThat(personSaved.getName()).isEqualTo(person.getName());
        verify(personRepository, Mockito.times(1)).save(person);
    }

    @Test
    public void save_throwException_whenPersonHasId() {
        Person person = GeneratePerson.validPerson1();

        assertThrows(InvalidPersonParam.class, () -> {
            personService.save(person);
        });

        verify(personRepository, never()).save(person);
    }

    @Test
    public void getAll_returnListPerson_whenPersonsExists() {
        BDDMockito.when(personRepository.findAll()).
                thenReturn(List.of(GeneratePerson.validPerson1()));

        List<Person> listPerson = personService.getAll();

        assertThat(listPerson).isNotNull();
        assertThat((listPerson.size())).isEqualTo(1);
    }

    @Test
    public void getAll_returnEmptyListPerson_whenPersonsNotExists() {
        BDDMockito.when(personRepository.findAll()).
                thenReturn(Collections.emptyList());

        List<Person> listPerson = personService.getAll();

        assertThat(listPerson).isNotNull();
        assertThat(listPerson).isEmpty();
    }

    @Test
    public void getById_returnPerson_whenIdExist() {
        BDDMockito.when(personRepository.findById(anyLong()))
                .thenReturn(Optional.of(GeneratePerson.validPerson1()));

        Optional<Person> person = personService.getById(1L);

        assertThat(person.isEmpty()).isFalse();
        assertThat(person.get()).isNotNull();
        assertThat(person.get().getId()).isEqualTo(GeneratePerson.validPerson1().getId());
    }

    @Test
    public void getById_returnEmptyPerson_whenIdNotExist() {
        BDDMockito.when(personRepository.findById(anyLong()))
                .thenReturn(Optional.ofNullable(null));

        Optional<Person> person = personService.getById(1L);

        assertThat(person.isEmpty()).isTrue();
    }

    @Test
    public void update_returnPersonUpdated_whenValidPerson() {
        Person person = GeneratePerson.validPerson1();

        BDDMockito.when(personRepository.save(person))
                .thenReturn(person);
        BDDMockito.when(personRepository.findById(anyLong()))
                .thenReturn(Optional.of(person));

        person.setName("Novo nome");

        Person updatedPerson = personService.update(person);

        assertThat(updatedPerson).isNotNull();
        assertThat(updatedPerson.getName()).isEqualTo(person.getName());
    }

    @Test
    public void delete_deletePerson_whenIdExist() {
        long personId = GeneratePerson.validPerson1().getId();

        BDDMockito.willDoNothing().given(personRepository).deleteById(anyLong());

        personRepository.deleteById(personId);

        verify(personRepository, only()).deleteById(personId);
    }

    @Test
    public void delete_ThrowException_whenIdNotExist() {
        final long NotExistId = 999L;

        assertThrows(PersonNotFoundException.class, () -> {
            personService.delete(NotExistId);
        });

        verify(personRepository, never()).deleteById(NotExistId);
    }

}



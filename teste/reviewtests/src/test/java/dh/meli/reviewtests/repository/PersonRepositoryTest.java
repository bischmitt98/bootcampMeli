package dh.meli.reviewtests.repository;

import dh.meli.reviewtests.model.Person;
import dh.meli.reviewtests.util.GeneratePerson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@DataJpaTest
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository repository;

    @Test
    public void save_returnSavedPerson_WhenValidPerson() {
        Person person = GeneratePerson.newPerson1ToSave();

        Person personSaved = repository.save(person);

        assertThat(personSaved.getName()).isEqualTo(person.getName());
    }

    @Test
    public void findById_ReturnPerson_whenFindSuccess() {
        Person newPerson = GeneratePerson.newPerson1ToSave();
        repository.save(newPerson);

        Person personFound = repository.findById(newPerson.getId()).get();

        assertThat(personFound.getName()).isEqualTo(newPerson.getName());
    }

    @Test
    public void findById_ReturnEmptyPerson_whenFindFail() {
        Person person = GeneratePerson.validPerson1();

        Optional<Person> personFound = repository.findById(person.getId());

        assertThat(personFound.isEmpty()).isTrue();
    }

    @Test
    public void findAll_ReturnListOfPerson_whenFindAllSuccess() {
        Person newPerson1 = GeneratePerson.newPerson1ToSave();
        Person newPerson2 = GeneratePerson.newPerson2ToSave();
        repository.save(newPerson1);
        repository.save(newPerson2);

        List<Person> persons = repository.findAll();

        assertThat(persons).isNotNull();
        assertThat(persons.size()).isEqualTo(2);
    }

    @Test
    public void update_ReturnPersonUpdated_whenUpdateSuccess() {
        Person newPerson = GeneratePerson.newPerson1ToSave();
        Person personSaved = repository.save(newPerson);
        personSaved.setName("New Name");

        Person personUpdated = repository.save(personSaved);

        assertThat(personUpdated.getName()).isEqualTo(personSaved.getName());
    }

    @Test
    public void deleteById_DeletePerson_whenPersonExist() {
        Person newPerson = GeneratePerson.newPerson1ToSave();
        Person personSaved = repository.save(newPerson);

        repository.deleteById(personSaved.getId());

        Optional<Person> personFound = repository.findById(newPerson.getId());
        assertThat(personFound.isEmpty()).isTrue();
    }

}

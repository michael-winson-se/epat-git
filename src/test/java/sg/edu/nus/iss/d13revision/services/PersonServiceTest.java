package sg.edu.nus.iss.d13revision.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sg.edu.nus.iss.d13revision.models.Person;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService();
    }

    // @Test
    // void testGetPersons_initialSize() {
    //     List<Person> persons = personService.getPersons();
    //     assertEquals(2, persons.size());
    // }

    // @Test
    // void testAddPerson() {
    //     Person p = new Person("Ada", "Lovelace");
    //     personService.addPerson(p);
    //     assertTrue(personService.getPersons().stream().anyMatch(per -> per.getFirstName().equals("Ada") && per.getLastName().equals("Lovelace")));
    // }

    // @Test
    // void testUpdatePerson() {
    //     Person original = personService.getPersons().get(0);
    //     String id = original.getId();
    //     Person updated = new Person(id, "Updated", "Name");
    //     personService.updatePerson(updated);
    //     assertTrue(personService.getPersons().stream().anyMatch(per -> per.getId().equals(id) && per.getFirstName().equals("Updated")));
    // }

    // @Test
    // void testRemovePerson() {
    //     Person toRemove = personService.getPersons().get(0);
    //     personService.removePerson(toRemove);
    //     assertFalse(personService.getPersons().stream().anyMatch(per -> per.getId().equals(toRemove.getId())));
    // }
}

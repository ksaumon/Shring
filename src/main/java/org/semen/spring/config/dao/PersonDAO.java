package org.semen.spring.config.dao;

import org.semen.spring.config.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;
    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom", 24, "fff1@hhhh.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Jon", 52, "fff2@hhhh.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Sem", 18, "fff3@hhhh.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Set", 34, "fff4@hhhh.ru"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }

}

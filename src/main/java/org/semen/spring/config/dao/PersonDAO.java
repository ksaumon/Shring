package org.semen.spring.config.dao;

import org.semen.spring.config.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private List<Person> people;
    {
        people = new ArrayList<Person>();

        people.add(new Person(1, "Tom"));
        people.add(new Person(2, "Jon"));
        people.add(new Person(3, "Sem"));
        people.add(new Person(4, "Set"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }


}

package org.semen.spring.config.util;


import org.semen.spring.config.dao.PersonDAO;
import org.semen.spring.config.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
@Component
public class PersonValidator implements Validator {
    private final PersonDAO personDAO;
    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;
        if (personDAO.show(person.getEmail()) != null) {// можно использовать.isPresent() в место проверки на null при
            // работе с Optional в классе PersonDAO в методе show
            errors.rejectValue("email", "", "This email  is already taken");
        }
        //Посмотреть есть ли такой же человек в bd
    }
}

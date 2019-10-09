package com.globewaytech.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.globewaytech.graphql.model.Person;
import com.globewaytech.graphql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonQuery implements GraphQLQueryResolver {
    @Autowired
    private PersonService personService;

    public List<Person> getPersons(final int count) {
        return personService.getAllPersons(count);
    }

    public Optional<Person> getPerson(final int id) {
        return personService.getPerson(id);
    }
}

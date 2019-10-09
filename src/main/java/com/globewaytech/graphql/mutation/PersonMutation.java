package com.globewaytech.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.globewaytech.graphql.model.Person;
import com.globewaytech.graphql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonMutation implements GraphQLMutationResolver {
    @Autowired
    private PersonService personService;

    public Person createPerson(final String name, final String street, final String houseNumber,
                               final String postalCode, final String city, final String country) {
        return personService.createPerson(name, street, houseNumber, postalCode, city, country);
    }
}

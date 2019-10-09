package com.globewaytech.graphql.service;

import com.globewaytech.graphql.model.Address;
import com.globewaytech.graphql.model.Person;
import com.globewaytech.graphql.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public Person createPerson(String name, String street, String houseNumber, String postalCode, String city, String country) {
        final Address address = Address.builder()
                .street(street)
                .houseNumber(houseNumber)
                .postalCode(postalCode)
                .city(city)
                .country(country)
                .build();

        final Person person = Person.builder()
                .name(name)
                .address(address)
                .build();
        return personRepository.save(person);
    }

    @Transactional(readOnly = true)
    public List<Person> getAllPersons(int count) {
        return personRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Person> getPerson(int id) {
        return personRepository.findById(id);
    }
}

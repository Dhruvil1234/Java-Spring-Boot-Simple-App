package com.example.simpleapp.service;

import com.example.simpleapp.model.Person;

import java.util.List;

public interface PersonService {
    void addPerson(Person person);

    List<Person> getAllPersons();
}

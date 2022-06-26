package com.example.simpleapp.service;

import com.example.simpleapp.model.Person;
import com.example.simpleapp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    List<Person> allPersons = new ArrayList<>();

    @Override
    public void addPerson(Person person) {
        allPersons.add(person);
    }

    @Override
    public List<Person> getAllPersons() {
        return allPersons;
    }
}
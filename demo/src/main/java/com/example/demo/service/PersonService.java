package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person) {
        return personRepository.save(new Person());
    }
    public Optional<Person> getPersonById(long id) {
        return personRepository.findById(id);
    }
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
    public void deletePerson(long id) {
        personRepository.deleteById(id);
    }
}

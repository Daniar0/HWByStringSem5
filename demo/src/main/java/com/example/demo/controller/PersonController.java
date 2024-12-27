package com.example.demo.controller;


import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    public Person createPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }
    @GetMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable long id) {
        return personService.getPersonById(id);
    }
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable long id) {
        personService.deletePerson(id);
    }
}

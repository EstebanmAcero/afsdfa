package com.uptc.frw.ferialibrorest.controller;

import com.uptc.frw.ferialibrorest.jpa.models.Person;
import com.uptc.frw.ferialibrorest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    private PersonService personService;
    @GetMapping
    public List<Person> getAllPersons() {
        return personService.findAll();
    }
    @GetMapping("{id}")
    public Person getPersonById(@PathVariable long id) {
        return personService.findById(id);
    }
    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personService.savePerson(person);
    }
    @PutMapping
    public Person updatePerson(@RequestBody Person person){
        return personService.updatePerson(person);
    }
    @DeleteMapping
    public void deletePerson(@RequestParam long id){
        personService.deletePerson(id);
    }
}

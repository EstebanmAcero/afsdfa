package com.uptc.frw.ferialibrorest.service;

import com.uptc.frw.ferialibrorest.jpa.models.Person;
import com.uptc.frw.ferialibrorest.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    public List<Person> findAll(){
        return personRepository.findAll();
    }
    public Person findById(Long id){
        return personRepository.findById(id).orElse(null);
    }
    public Person savePerson(Person person){
        return personRepository.save(person);
    }
    public Person updatePerson(Person person){
        Person personOld= findById(person.getId());
        personOld.setName(person.getName());
        personOld.setLastName(person.getLastName());
        return personRepository.save(personOld);
    }
    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }
}

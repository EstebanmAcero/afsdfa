package com.uptc.frw.ferialibrorest.jpa.repository;

import com.uptc.frw.ferialibrorest.jpa.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

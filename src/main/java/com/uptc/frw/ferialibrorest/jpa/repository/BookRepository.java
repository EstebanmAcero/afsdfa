package com.uptc.frw.ferialibrorest.jpa.repository;

import com.uptc.frw.ferialibrorest.jpa.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}

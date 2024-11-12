package com.uptc.frw.ferialibrorest.service;

import com.uptc.frw.ferialibrorest.jpa.models.Book;
import com.uptc.frw.ferialibrorest.jpa.models.Edition;
import com.uptc.frw.ferialibrorest.jpa.repository.BookRepository;
import com.uptc.frw.ferialibrorest.jpa.repository.EditionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EditionService {
    @Autowired
    private EditionRepository editionRepository;
    @Autowired
    private BookRepository bookRepository;
    public List<Edition> findAllEdition(){
        return editionRepository.findAll();
    }
    public Edition findByIdEdition(Long id){
        return editionRepository.findById(id).orElse(null);
    }
    public Edition saveEdition(Edition edition){
//        edition.setBookId(edition.getBook().getId()); // Establecemos el ID del libro
//        return editionRepository.save(edition);
        return edition;
    }
    public Edition updateEdition(Edition edition){
        Edition existingEdition = findByIdEdition(edition.getBookId());
        existingEdition.setYear(edition.getYear());
        existingEdition.setNumber(edition.getNumber());
        existingEdition.setDescription(edition.getDescription());
        return editionRepository.save(existingEdition);
    }
    public void deleteEdition(Long id){
        editionRepository.deleteById(id);
    }
}

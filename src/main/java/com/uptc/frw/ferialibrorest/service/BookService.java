package com.uptc.frw.ferialibrorest.service;

import com.uptc.frw.ferialibrorest.jpa.models.Book;
import com.uptc.frw.ferialibrorest.jpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
    public Book findBook(long id){
        return bookRepository.findById(id).orElse(null);
    }

    public Book save(Book book){   // saveBook
        return bookRepository.save(book);
    }

    public Book updateBook(Book book){
        Book bookOld = findBook(book.getId());
        bookOld.setTitle(book.getTitle());
        bookOld.setPrice(book.getPrice());
        return save(book);

    }

    public void deleteBook(long id){
        bookRepository.deleteById(id);
    }

}

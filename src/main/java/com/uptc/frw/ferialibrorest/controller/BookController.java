package com.uptc.frw.ferialibrorest.controller;

import com.uptc.frw.ferialibrorest.jpa.models.Book;
import com.uptc.frw.ferialibrorest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public List<Book> getAllBook(){
        return bookService.findAll();
    }
    @GetMapping("{id}")
    public Book getBookById(@PathVariable long id){
        return bookService.findBook(id);
    }
    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return bookService.save(book);
    }
    @PutMapping
    public Book updateBook(@RequestBody Book book ){
        return bookService.updateBook(book);
    }
    @DeleteMapping
    public void deleteBook(@RequestParam long id){
        bookService.deleteBook(id);
    }
}

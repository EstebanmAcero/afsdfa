package com.uptc.frw.ferialibrorest.jpa.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table ( name= "EDICIONES")
public class Edition {


    @Id
    @Column ( name = "ID_LIBRO")
    private long bookId;
    @Column ( name = "ANIO_PUBLICACION")
    private int year;
    @Column ( name = "NUMERO")
    private long number;
    @Column ( name = "DESCRIPCION")
    private String description;
    @MapsId
    @OneToOne
    @JoinColumn(name = "ID_LIBRO")
    @JsonIgnore
    private Book book ;

    public Edition() {
    }

    public Book getBook() {

        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Edition{" +
                "bookId=" + bookId +
                ", year=" + year +
                ", number=" + number +
                ", description='" + description + '\'' +
                '}';
    }
}

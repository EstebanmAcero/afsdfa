package com.uptc.frw.ferialibrorest.jpa.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "PERSONAS")
public class Person {
    @Id
    @Column (name = "ID_PERSONA")
    private long id;
    @Column (name = "NOMBRES")
    private String name;
    @Column (name = "APELLIDOS")
    private String lastName;
    @Column (name = "NACIONALIDAD")
    private String nationality;
    @OneToMany( mappedBy = "person")
    @JsonIgnore
    private List<Bill> bills;
    @ManyToMany(mappedBy = "authors")
    @JsonIgnore
    private List<Book> books;
    public Person() {

        // esto es la genracion de un contructo
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

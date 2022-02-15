package com.eluta.LibraryAPI.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//allows database operations for this custom data type "Book"
//creates table
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;

    public Book(Long id, String title) {
        this.id = id;
        this.title = title;
    }
    public Book (){} //no parameters

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}

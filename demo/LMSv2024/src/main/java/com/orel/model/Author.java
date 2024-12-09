package com.orel.model;
import jakarta.persistence.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
//    @JsonManagedReference  // This annotation tells Jackson to serialize the books list, but not the author in the book
    @JsonBackReference 
    private List<Book> books;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

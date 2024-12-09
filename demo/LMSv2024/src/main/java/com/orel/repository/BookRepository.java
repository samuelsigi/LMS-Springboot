package com.orel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orel.model.Book;

import java.util.List;
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthorId(Long authorId);
    List<Book> findByNameContaining(String name);
}

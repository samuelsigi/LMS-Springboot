package com.orel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orel.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
package com.ayudantia.modelos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ayudantia.modelos.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {

    List<Book> findAll();
    
}

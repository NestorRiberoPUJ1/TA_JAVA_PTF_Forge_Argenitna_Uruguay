package com.ayudantia.modelos.services;

import com.ayudantia.modelos.models.Book;
import com.ayudantia.modelos.models.User;
import com.ayudantia.modelos.repositories.BookRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public List<Book> getAll() {
    return bookRepository.findAll();
  }

  public Book create(Book book) {
    return bookRepository.save(book);
  }

  public Book findBook(Long id) {
    Optional<Book> optionalBook = bookRepository.findById(id);
    if (optionalBook.isPresent()) {
      return optionalBook.get();
    } else {
      return null;
    }
  }

  public void delete(Book book) {
    bookRepository.delete(book);
  }
}

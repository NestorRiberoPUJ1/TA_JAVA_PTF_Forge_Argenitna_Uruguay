package com.ayudantia.modelos.controllers;

import com.ayudantia.modelos.models.Book;
import com.ayudantia.modelos.services.BookService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController {

  private final BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping("")
  public String getAll() {
    return bookService.getAll().toString();
  }

  @GetMapping("/{id}")
  public String getById(@PathVariable("id") Long id) {
    return bookService.findBook(id).toString();
  }

  @PostMapping("")
  public String create(
    @RequestParam("title") String title,
    @RequestParam("pages") Integer pages
  ) {
    Book newBook = new Book(title, pages);

    return bookService.create(newBook).toString();
  }

  @DeleteMapping("/{id}")
  public String delete(@PathVariable("id") Long id) {
    Book book = bookService.findBook(id);
    bookService.delete(book);
    return  "deleted";
  }
}

package com.eluta.LibraryAPI.controllers;

import com.eluta.LibraryAPI.models.Book;
import com.eluta.LibraryAPI.services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController { //directs to routes
  @Autowired LibraryService libraryService;

  @DeleteMapping("/books/{id}")
  void deleteBook(@PathVariable Long id) {  //converts our String to a Long
    libraryService.deleteById(id);
  }
  @GetMapping("/books") //our route where the books will be returned
  public List<Book> getbooks() { // return list of books
    return libraryService.getbooks();
  }
  @GetMapping("/books/{id}")
  public Book getbyid(@PathVariable String id) {
    return libraryService.getbookbyid(id);
  }
  @PostMapping("/books")
  Book addBook(@RequestBody Book newBook) {
    return libraryService.addBook(newBook);
  }


}


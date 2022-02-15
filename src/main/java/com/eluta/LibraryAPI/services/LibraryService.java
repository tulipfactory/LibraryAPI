package com.eluta.LibraryAPI.services;

import com.eluta.LibraryAPI.models.Book;
import com.eluta.LibraryAPI.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //the type of bean :)
public class LibraryService {
    @Autowired
    LibraryRepository libraryRepository;
    public List<Book> getbooks() { //the first in a method is what you are returning. then method name
        return libraryRepository.findAll();
    }
    public Book getbookbyid(String id){
        Long convertedid = Long.valueOf(id);
        return libraryRepository.findById(convertedid).get();
        //getting a book by its id (get method)
    }
    public Book addBook(Book newBook) {
        return libraryRepository.save(newBook);
    }
    public void deleteById(Long id){
        libraryRepository.deleteById(id);
    }
}

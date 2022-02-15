package com.eluta.LibraryAPI.repositories;

import com.eluta.LibraryAPI.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Book, Long> {

}

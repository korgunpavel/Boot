package com.korgun.springcourse.ProjectBoot.repositories;

import com.korgun.springcourse.ProjectBoot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LibraryRepository extends JpaRepository<Book, Integer> {

    List<Book> findByTitleStartingWith(String startingWith);
}

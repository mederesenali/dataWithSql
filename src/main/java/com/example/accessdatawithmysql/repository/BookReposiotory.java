package com.example.accessdatawithmysql.repository;

import com.example.accessdatawithmysql.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookReposiotory extends CrudRepository<Book,Integer> {
     Book findAllByName(String name);

}

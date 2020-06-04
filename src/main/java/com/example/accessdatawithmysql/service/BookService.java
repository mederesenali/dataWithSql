package com.example.accessdatawithmysql.service;

import com.example.accessdatawithmysql.model.Book;
import com.example.accessdatawithmysql.repository.BookReposiotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService  {
    @Autowired
    BookReposiotory bookReposiotory;
    public void addBook(Book book){
        bookReposiotory.save(book);
    }
    public List<Book> allBooks(){
        return (List<Book>) bookReposiotory.findAll();
    }
    public Optional<Book> get(Integer id) {
        return bookReposiotory.findById(id);
    }

    public void delete(Integer id) {
        bookReposiotory.deleteById(id);
    }
   public List<Book> findAllByName(String name){
        return (List<Book>) bookReposiotory.findAllByName(name);
   }


    public Optional<Book> findBookById(Integer id) {
        return bookReposiotory.findById(id);
    }
}

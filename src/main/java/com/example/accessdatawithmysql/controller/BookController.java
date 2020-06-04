package com.example.accessdatawithmysql.controller;

import com.example.accessdatawithmysql.model.Book;
import com.example.accessdatawithmysql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("books", bookService.allBooks());
        return "home";
    }

    @GetMapping("/addBook")
    public String addBookPage(Model model) {
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(Book book) {
        bookService.addBook(book);
        return "redirect:/";
    }

    @GetMapping("/book/{id}")
    public String bookDetail(@PathVariable("id") int id, Model model) {
        model.addAttribute("book", bookService.findBookById(id).get());
        return "bookDetail";
    }
}

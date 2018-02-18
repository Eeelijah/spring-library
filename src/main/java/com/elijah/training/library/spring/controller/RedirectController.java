package com.elijah.training.library.spring.controller;

import com.elijah.training.library.domain.Book;
import com.elijah.training.library.domain.Genre;
import com.elijah.training.library.domain.Publisher;
import com.elijah.training.library.spring.repository.AuthorRepository;
import com.elijah.training.library.domain.Author;
import com.elijah.training.library.spring.repository.BookRepository;
import com.elijah.training.library.spring.repository.GenreRepository;
import com.elijah.training.library.spring.repository.PublisherRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@Log
public class RedirectController {

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private GenreRepository genreRepository;
    @Autowired
    private PublisherRepository publisherRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String baseUrlRedirect(HttpServletRequest request, HttpServletResponse response) {

        List<Author> authorList = authorRepository.findAll();
        List<Book> bookList = bookRepository.findAll();
        List<Genre> genreList = genreRepository.findAll();
        List<Publisher> publisherList = publisherRepository.findAll();

        return "ok";
    }
}

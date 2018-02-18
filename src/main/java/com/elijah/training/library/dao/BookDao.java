package com.elijah.training.library.dao;

import com.elijah.training.library.domain.Book;

import java.util.List;

public interface BookDao extends GeneralDao<Book> {

    List<Book> findTopBooks(int limit);
}

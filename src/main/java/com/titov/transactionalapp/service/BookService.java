package com.titov.transactionalapp.service;

import com.titov.transactionalapp.model.Book;
import com.titov.transactionalapp.model.Response;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 0:46
 **/
public interface BookService {
    Response<Book> getBookById(Long id);

    Response<Book> addBook(Book book);
}

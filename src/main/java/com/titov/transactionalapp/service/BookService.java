package com.titov.transactionalapp.service;

import com.titov.transactionalapp.model.Book;
import com.titov.transactionalapp.repository.entity.BookEntity;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 0:46
 **/
public interface BookService {
    BookEntity getBookById(Long id);

    BookEntity addBook(Book book);
}

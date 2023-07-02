package com.titov.transactionalapp.service;

import com.titov.transactionalapp.repository.AuthorRepository;
import com.titov.transactionalapp.repository.BooksRepository;
import com.titov.transactionalapp.repository.entity.AuthorEntity;
import com.titov.transactionalapp.repository.entity.BookEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 0:50
 **/
@Service
@Primary
@RequiredArgsConstructor
public class BookGetterImpl implements BookService {
    private final BooksRepository booksRepository;
    private final AuthorRepository authorRepository;

    @Override
    public BookEntity getBookById(Long id) {
        return booksRepository.findById(id).get();
    }

    @Override
    @Transactional
    public BookEntity addBook(BookEntity book) {
        AuthorEntity author = book.getAuthor();
        authorRepository.save(author);

        return booksRepository.save(book);
    }


}

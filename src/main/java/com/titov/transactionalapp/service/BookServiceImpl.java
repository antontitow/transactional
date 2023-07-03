package com.titov.transactionalapp.service;

import com.titov.transactionalapp.mapper.AuthorToEntityMapper;
import com.titov.transactionalapp.mapper.BookToEntityMapper;
import com.titov.transactionalapp.model.Author;
import com.titov.transactionalapp.model.Book;
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
public class BookServiceImpl implements BookService {
    private final BooksRepository booksRepository;
    private final AuthorRepository authorRepository;

    @Override
    public BookEntity getBookById(Long id) {
        return booksRepository.findById(id).get();
    }

    @Override
    @Transactional
    public BookEntity addBook(Book book) {
        Author author = book.getAuthor();
        AuthorEntity authorEntity = authorRepository.save(AuthorToEntityMapper.map(author));
        BookEntity bookEntity = BookToEntityMapper.map(book);
        bookEntity.setAuthor(authorEntity);

        return booksRepository.save(bookEntity);
    }


}

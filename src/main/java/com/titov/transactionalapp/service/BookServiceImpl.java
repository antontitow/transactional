package com.titov.transactionalapp.service;

import com.titov.transactionalapp.exception.NoRecordException;
import com.titov.transactionalapp.mapper.AuthorToEntityMapper;
import com.titov.transactionalapp.model.Author;
import com.titov.transactionalapp.model.Book;
import com.titov.transactionalapp.model.Response;
import com.titov.transactionalapp.repository.AuthorRepository;
import com.titov.transactionalapp.repository.BooksRepository;
import com.titov.transactionalapp.repository.entity.AuthorEntity;
import com.titov.transactionalapp.repository.entity.BookEntity;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.titov.transactionalapp.mapper.BookToEntityMapper.map;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 0:50
 **/
@Service
@Primary
@RequiredArgsConstructor
@Slf4j
public class BookServiceImpl implements BookService {

    private final BooksRepository booksRepository;
    private final AuthorRepository authorRepository;

    @SneakyThrows
    @Override
    public Response<Book> getBookById(Long id) {
        log.info("Getting book by id {}", id);
        BookEntity bookEntity = booksRepository.findByBookEntityId(id);

        if (bookEntity == null) {
            throw new NoRecordException("No elements");
        }

        return new Response<>(map(bookEntity));
    }

    @Override
    @Transactional
    public Response<Book> addBook(Book book) {
        Author author = book.getAuthor();
        AuthorEntity authorEntity = authorRepository.save(AuthorToEntityMapper.map(author));
        BookEntity bookEntity = map(book);
        bookEntity.setAuthor(authorEntity);

        return new Response<>(map(booksRepository.save(bookEntity)));
    }


}

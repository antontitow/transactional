package com.titov.transactionalapp.mapper;

import com.titov.transactionalapp.model.Book;
import com.titov.transactionalapp.repository.entity.BookEntity;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 3:31
 **/
public class BookToEntityMapper {
    public static BookEntity map(Book book) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setAuthor(AuthorToEntityMapper.map(book.getAuthor()));
        bookEntity.setCost(bookEntity.getCost());
        bookEntity.setTitle(book.getTitle());
        bookEntity.setDescription(book.getDescription());
        bookEntity.setPageCount(book.getPageCount());

        return bookEntity;
    }
}

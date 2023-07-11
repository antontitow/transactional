package com.titov.transactionalapp.mapper;

import com.titov.transactionalapp.model.Book;
import com.titov.transactionalapp.repository.entity.BookEntity;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 3:31
 **/
public class BookToEntityMapper {
    public static BookEntity map(Book book) {
        return BookEntity
                .builder()
                .cost(book.getCost())
                .title(book.getTitle())
                .description(book.getDescription())
                .pageCount(book.getPageCount())
                .orders(book.getOrders())
                .build();
    }

    public static Book map(BookEntity bookEntity) {
        return Book
                .builder()
                .author(AuthorToEntityMapper.map(bookEntity.getAuthor()))
                .cost(bookEntity.getCost())
                .title(bookEntity.getTitle())
                .description(bookEntity.getDescription())
                .pageCount(bookEntity.getPageCount())
                .orders(bookEntity.getOrders())
                .build();
    }
}

package com.titov.transactionalapp.controller;

import com.titov.transactionalapp.repository.entity.BookEntity;
import com.titov.transactionalapp.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 0:40
 **/
@RestController
@RequestMapping("book/")
@RequiredArgsConstructor
public class Controller {
    private final BookService bookService;

    @RequestMapping("get/{id}")
    public BookEntity getBook(@PathVariable Long id) {
        return bookService.getBookById(id);
    }


    @PostMapping("add")
    public BookEntity getBook(@RequestBody BookEntity book) {
        return bookService.addBook(book);
    }
}

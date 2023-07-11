package com.titov.transactionalapp.controller;

import com.titov.transactionalapp.model.Book;
import com.titov.transactionalapp.model.Response;
import com.titov.transactionalapp.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 0:40
 **/
@RestController
@RequestMapping("book/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BookController {
    private final BookService bookService;

    @GetMapping("get/{id}")
    public Response<Book> getBook(@PathVariable Long id) {
        return bookService.getBookById(id);
    }


    @PostMapping("add")
    public Response<Book> addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }
}

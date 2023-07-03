package com.titov.transactionalapp.exception;

import com.titov.transactionalapp.model.Response;
import com.titov.transactionalapp.repository.entity.AbstractEntity;
import com.titov.transactionalapp.repository.entity.BookEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.NoSuchElementException;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 03.07.2023, 21:23
 **/
@ControllerAdvice
@Slf4j
public class CommonExceptionHandler {

    @ExceptionHandler({NoSuchElementException.class, NoRecordException.class})
    @ResponseBody
    public Response<BookEntity> handleNoRecordException(NoRecordException e) {
        log.error("error:", e.getMessage());

        return new Response(new AbstractEntity("No books elements"));
    }

    @ExceptionHandler(PersonAgeException.class)
    @ResponseBody
    public Response<String> handlePersonAgeException(PersonAgeException e) {
        log.error("error:", e.getMessage());

        return new Response("Wrong worker age");
    }
}

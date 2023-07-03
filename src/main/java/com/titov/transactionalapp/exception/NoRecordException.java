package com.titov.transactionalapp.exception;

import java.util.NoSuchElementException;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 03.07.2023, 21:50
 **/
public class NoRecordException extends NoSuchElementException {

    public NoRecordException() {
        super("No elements");
    }
}

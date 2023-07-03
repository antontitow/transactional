package com.titov.transactionalapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 03.07.2023, 21:28
 **/
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Response<T> {
    private HttpStatus status;
    private T body;


    public Response(T body) {
        this.status = HttpStatus.OK;
        this.body = body;
    }
}

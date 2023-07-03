package com.titov.transactionalapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 0:46
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

    private Author author;
    private Long cost;
    private String title;
    private Long pageCount;
    private String description;
}

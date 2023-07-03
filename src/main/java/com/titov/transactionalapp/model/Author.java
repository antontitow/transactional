package com.titov.transactionalapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 3:33
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {
    private String name;
    private String surname;
    private String patronymic;
}

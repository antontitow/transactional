package com.titov.transactionalapp.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 03.07.2023, 22:11
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AbstractEntity {
    private String descriptionError;
}

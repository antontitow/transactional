package com.titov.transactionalapp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 04.07.2023, 0:26
 **/
@AllArgsConstructor
@Getter
public enum Gender {

    FEMALE("женский"),
    MALE("мужской");

    private String gender;
}

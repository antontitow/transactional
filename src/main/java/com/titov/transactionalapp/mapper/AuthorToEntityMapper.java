package com.titov.transactionalapp.mapper;

import com.titov.transactionalapp.model.Author;
import com.titov.transactionalapp.repository.entity.AuthorEntity;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 3:35
 **/
public class AuthorToEntityMapper {
    public static AuthorEntity map(Author author) {
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setName(author.getName());
        authorEntity.setSurname(author.getSurname());
        authorEntity.setPatronymic(author.getPatronymic());

        return authorEntity;
    }
}

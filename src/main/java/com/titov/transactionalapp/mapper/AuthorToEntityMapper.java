package com.titov.transactionalapp.mapper;

import com.titov.transactionalapp.model.Author;
import com.titov.transactionalapp.repository.entity.AuthorEntity;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 3:35
 **/
public class AuthorToEntityMapper {
    public static AuthorEntity map(Author author) {
        return AuthorEntity.builder()
                .name(author.getName())
                .surname(author.getSurname())
                .patronymic(author.getPatronymic())
                .build();
    }

    public static Author map(AuthorEntity authorEntity) {
        return Author.builder()
                .name(authorEntity.getName())
                .surname(authorEntity.getSurname())
                .patronymic(authorEntity.getPatronymic())
                .build();
    }
}

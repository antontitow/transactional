package com.titov.transactionalapp.repository;

import com.titov.transactionalapp.repository.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 3:21
 **/
@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
}

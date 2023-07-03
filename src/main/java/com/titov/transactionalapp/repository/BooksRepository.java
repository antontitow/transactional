package com.titov.transactionalapp.repository;

import com.titov.transactionalapp.repository.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 0:55
 **/
@Repository
public interface BooksRepository extends JpaRepository<BookEntity, Long> {

    @Query("SELECT be FROM book be where be.id = :id")
    BookEntity findByBookEntityId(Long id);
}

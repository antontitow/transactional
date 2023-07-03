package com.titov.transactionalapp.repository.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 1:01
 **/
@Entity
@Data
public class BookEntity {
    @Id
    @GeneratedValue
    @Column
    private Long id;
    @ManyToOne
    private AuthorEntity author;
    @Column
    private Long cost;
    @Column
    private String title;
    @Column
    private Long pageCount;
    @Column
    private String description;
}

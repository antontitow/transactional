package com.titov.transactionalapp.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 1:01
 **/
@Entity
@Data
//@Table(name = "Book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
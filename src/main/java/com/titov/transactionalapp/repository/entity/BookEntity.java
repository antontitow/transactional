package com.titov.transactionalapp.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 1:01
 **/
@Entity(name = "book")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity extends AbstractEntity{
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

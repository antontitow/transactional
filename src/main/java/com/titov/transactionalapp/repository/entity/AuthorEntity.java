package com.titov.transactionalapp.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 02.07.2023, 0:58
 **/
@Entity
@Data
//@Table(name = "Author")
public class AuthorEntity {
    @Id
    @GeneratedValue
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String patronymic;
}

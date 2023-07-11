package com.titov.transactionalapp.repository.entity;


import com.titov.transactionalapp.enums.Gender;
import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 04.07.2023, 0:23
 **/
@Entity(name = "worker")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WorkerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @OneToMany
    @JoinColumn(name = "order_id")
    private List<OrderEntity> orders;

    @Column
    private Integer age;

    @Column
    private Gender gender;

    @Column
    @NonNull
    private String name;

}

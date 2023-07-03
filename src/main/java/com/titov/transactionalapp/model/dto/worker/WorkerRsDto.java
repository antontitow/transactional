package com.titov.transactionalapp.model.dto.worker;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.titov.transactionalapp.enums.Gender;
import com.titov.transactionalapp.repository.entity.OrderEntity;
import lombok.*;

import java.util.List;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 04.07.2023, 0:49
 **/
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class WorkerRsDto {
    private Long id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<OrderEntity> orders;
    private Integer age;
    private Gender gender;
    private String name;
}

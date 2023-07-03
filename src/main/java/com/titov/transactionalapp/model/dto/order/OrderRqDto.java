package com.titov.transactionalapp.model.dto.order;

import lombok.Getter;
import lombok.Setter;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 04.07.2023, 2:14
 **/
@Getter
@Setter
public class OrderRqDto {
    private Long workerId;
    private Double amount;
}

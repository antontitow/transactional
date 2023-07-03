package com.titov.transactionalapp.mapper;

import com.titov.transactionalapp.model.dto.order.OrderRqDto;
import com.titov.transactionalapp.repository.entity.OrderEntity;
import org.mapstruct.Mapper;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 04.07.2023, 2:18
 **/
@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderEntity mapToEntitty(OrderRqDto orderRqDto);
}

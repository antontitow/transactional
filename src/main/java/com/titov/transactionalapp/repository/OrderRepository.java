package com.titov.transactionalapp.repository;

import com.titov.transactionalapp.repository.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 04.07.2023, 2:16
 **/
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}

package com.titov.transactionalapp.repository;

import com.titov.transactionalapp.repository.entity.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 04.07.2023, 1:22
 **/
@Repository
public interface WorkerRepository extends JpaRepository<WorkerEntity, Long> {
}

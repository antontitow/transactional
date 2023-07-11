package com.titov.transactionalapp.mapper;

import com.titov.transactionalapp.model.dto.worker.WorkerRqDto;
import com.titov.transactionalapp.model.dto.worker.WorkerRsDto;
import com.titov.transactionalapp.repository.entity.WorkerEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 04.07.2023, 1:31
 **/
@Mapper(componentModel = "spring")
public interface WorkerMapper {

    WorkerEntity mapToEntity(WorkerRqDto workerRqDto);

    WorkerRsDto mapFromEntity(WorkerEntity workerEntity);

    List<WorkerRsDto> mapFromListEntity(List<WorkerEntity> workerEntity);
}

package com.titov.transactionalapp.service;

import com.titov.transactionalapp.model.Response;
import com.titov.transactionalapp.model.dto.order.OrderRqDto;
import com.titov.transactionalapp.model.dto.worker.WorkerRqDto;
import com.titov.transactionalapp.model.dto.worker.WorkerRsDto;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 04.07.2023, 1:26
 **/
public interface WorkerService {
    Response<WorkerRsDto> registerWorker(WorkerRqDto workerRqDto);

    Response<WorkerRsDto> addOrderToWorker(OrderRqDto orderRqDto);
}

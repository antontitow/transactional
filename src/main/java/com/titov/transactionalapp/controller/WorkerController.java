package com.titov.transactionalapp.controller;

import com.titov.transactionalapp.model.Response;
import com.titov.transactionalapp.model.dto.order.OrderRqDto;
import com.titov.transactionalapp.model.dto.worker.WorkerRqDto;
import com.titov.transactionalapp.model.dto.worker.WorkerRsDto;
import com.titov.transactionalapp.service.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 04.07.2023, 0:42
 **/
@RestController
@RequestMapping("worker/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WorkerController {
    private final WorkerService workerService;

    @PostMapping("register")
    public Response<WorkerRsDto> registerWorker(@RequestBody @Valid WorkerRqDto workerRqDto) {
        return workerService.registerWorker(workerRqDto);
    }

    @PostMapping("order/add")
    public Response<WorkerRsDto> addOrder(@RequestBody OrderRqDto orderRqDto) {
        return workerService.addOrderToWorker(orderRqDto);
    }
}

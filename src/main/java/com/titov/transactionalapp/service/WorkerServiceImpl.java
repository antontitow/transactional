package com.titov.transactionalapp.service;

import com.titov.transactionalapp.mapper.OrderMapper;
import com.titov.transactionalapp.mapper.WorkerMapper;
import com.titov.transactionalapp.model.Response;
import com.titov.transactionalapp.model.dto.order.OrderRqDto;
import com.titov.transactionalapp.model.dto.worker.WorkerRqDto;
import com.titov.transactionalapp.model.dto.worker.WorkerRsDto;
import com.titov.transactionalapp.repository.OrderRepository;
import com.titov.transactionalapp.repository.WorkerRepository;
import com.titov.transactionalapp.repository.entity.OrderEntity;
import com.titov.transactionalapp.repository.entity.WorkerEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 04.07.2023, 1:27
 **/
@Service
@Primary
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class WorkerServiceImpl implements WorkerService {
    private final WorkerRepository workerRepository;
    private final OrderRepository orderRepository;
    private final WorkerMapper workerMapper;
    private final OrderMapper orderMapper;

    @Override
    public Response<WorkerRsDto> registerWorker(WorkerRqDto workerRqDto) {
        WorkerEntity workerEntity = workerMapper.mapToEntity(workerRqDto);

        return new Response<>(workerMapper.mapFromEntity(workerRepository.save(workerEntity)));
    }

    @Override
    @Transactional
    public Response<WorkerRsDto> addOrderToWorker(OrderRqDto orderRqDto) {
        OrderEntity orderEntity = orderRepository.save(orderMapper.mapToEntitty(orderRqDto));
        log.info("WorkerId", orderRqDto.getWorkerId());
        Optional<WorkerEntity> workerEntityOptional = workerRepository.findById(orderRqDto.getWorkerId());
        WorkerEntity workerEntity = workerEntityOptional.get();
        List<OrderEntity> orderEntityList = workerEntity.getOrders();

        if (orderEntityList == null) {
            orderEntityList = new ArrayList<>();
        }

        orderEntityList.add(orderEntity);
        workerEntity.setOrders(orderEntityList);

        return new Response<>(workerMapper.mapFromEntity(workerRepository.save(workerEntity)));
    }
}

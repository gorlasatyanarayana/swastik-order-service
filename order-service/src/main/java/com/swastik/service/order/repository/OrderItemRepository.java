package com.swastik.service.order.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swastik.service.order.entity.OrderItemEntity;

public interface OrderItemRepository extends JpaRepository<OrderItemEntity, UUID>{

}

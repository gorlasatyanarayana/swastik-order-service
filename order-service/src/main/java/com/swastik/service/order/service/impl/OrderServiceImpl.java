package com.swastik.service.order.service.impl;

import java.time.LocalDateTime;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swastik.service.order.dto.OrderCreateDto;
import com.swastik.service.order.dto.OrderCreateResponse;
import com.swastik.service.order.entity.OrderMastEntity;
import com.swastik.service.order.repository.OrderHistRepository;
import com.swastik.service.order.repository.OrderItemRepository;
import com.swastik.service.order.repository.OrderMastRepository;
import com.swastik.service.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);
	
	@Autowired
	OrderMastRepository orderMastRepository;
	
	@Autowired
	OrderItemRepository orderItemRepository;
	
	
	@Autowired
	OrderHistRepository orderHistRepository;
	
	@Override
	public OrderCreateResponse createOrder(OrderCreateDto request) {
		// TODO Auto-generated method stub
		
		OrderCreateResponse response = null;
		
		log.info("[Create-Order] entered {} ",request);
		
		log.info("[Create-Order] creating new order");
		
		OrderMastEntity orderMastEntity= new OrderMastEntity();
		orderMastEntity.setCreatedBy("Order Service");
		orderMastEntity.setOrderDate(LocalDateTime.now());
		orderMastEntity.setOrderStatus("PENDING");
		orderMastEntity.setCustomerId(UUID.fromString(request.getCustomerId()));
		orderMastEntity.setPaymentMethod(request.getPaymentMethod());
		orderMastEntity.setShippingAddress(request.getShippingAddress());
		orderMastEntity.setCreatedAt(LocalDateTime.now());
		
		orderMastEntity = orderMastRepository.save(orderMastEntity);
		
		if(orderMastEntity !=null && orderMastEntity.getId() != null) {
			log.info("[Create-Order] order created successfully with order id : {} ",orderMastEntity.getId());
			
			
			response = OrderCreateResponse.builder().success(true).orderId(orderMastEntity.getId().toString()).
					orderStatus("PENDING").
					build();
		} else {	
			log.info("[Create-Order] failed to create order");
			response = OrderCreateResponse.builder().success(false).orderId(null).build();
		}
				
		return response;
	}

}

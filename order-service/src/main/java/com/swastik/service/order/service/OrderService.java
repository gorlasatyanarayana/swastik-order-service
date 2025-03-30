package com.swastik.service.order.service;

import com.swastik.service.order.dto.OrderCreateDto;
import com.swastik.service.order.dto.OrderCreateResponse;

public interface OrderService {
	OrderCreateResponse createOrder(OrderCreateDto request);

}

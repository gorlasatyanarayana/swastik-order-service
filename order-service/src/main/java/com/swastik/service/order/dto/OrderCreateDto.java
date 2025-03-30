package com.swastik.service.order.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreateDto {
	
	private String customerId;
	private List<OrderItem> items;
	private String paymentMethod;
	private String shippingAddress;
	

	

}

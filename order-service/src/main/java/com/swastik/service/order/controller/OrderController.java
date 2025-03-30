package com.swastik.service.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swastik.service.order.dto.OrderCreateDto;
import com.swastik.service.order.dto.OrderCreateResponse;
import com.swastik.service.order.service.OrderService;



@RestController
@RequestMapping("/api")
public class OrderController {
	
	private static final Logger log = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	OrderService orderService;
	
	@PostMapping(value = "/{version}/order/create")
	public ResponseEntity<?> createOrder(@PathVariable("version") String version, @RequestBody OrderCreateDto request){
		
		log.info("Entered in method-createOrder of class-OrderController");
		OrderCreateResponse response = orderService.createOrder(request);
		return ResponseEntity.ok(response);
	}
	
	
	

}

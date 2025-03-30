package com.swastik.service.order.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderMastEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3583156720131874L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true,  nullable = false)
	private UUID id;
	
	@Column(name = "customer_id")
	private UUID customerId;
	
	@Column(name = "order_date")
	private LocalDateTime orderDate;
	
	@Column(name = "total_amount")
	private BigDecimal totalAmount;
	
	@Column(name = "order_status")
	private String orderStatus;
	
	@Column(name = "payment_method")
	private String paymentMethod;
	
	@Column(name = "shipping_address")
	private String shippingAddress;	
	
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@Column(name = "updated_by")
	private String updatedBy;	
	
}

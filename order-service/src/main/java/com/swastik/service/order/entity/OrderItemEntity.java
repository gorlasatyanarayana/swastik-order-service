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
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "swastikorder", name = "order_items")
public class OrderItemEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3583156720131874L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true,  nullable = false)
	private UUID id;
	
	@Column(name = "order_id")
	private UUID orderId;
	
	@Column(name = "product_id")
	private UUID productId;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "price")
	private BigDecimal price;
	
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@Column(name = "updated_by")
	private String updatedBy;	

}

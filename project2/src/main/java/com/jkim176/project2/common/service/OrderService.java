package com.jkim176.project2.common.service;

import java.util.List;

import com.jkim176.project2.common.data.entity.Order;

public interface OrderService {
	
	List<Order> findAllOrderByCustomer(Long customerId);
}

package com.jkim176.project2.common.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkim176.project2.common.data.entity.Customer;
import com.jkim176.project2.common.data.entity.Order;
import com.jkim176.project2.common.data.repository.CustomerRepository;
import com.jkim176.project2.common.data.repository.OrderRepository;
import com.jkim176.project2.common.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	private final CustomerRepository customerRepository;
	private final OrderRepository orderRepository;
	
	@Autowired
	public OrderServiceImpl(CustomerRepository customerRepository, OrderRepository orderRepository) {
		this.customerRepository = customerRepository;
		this.orderRepository = orderRepository;
	}
	
	@Override
	public List<Order> findAllOrderByCustomer(Long customerId) {
		List<Order> orderList = new ArrayList<>();
		Optional<Customer> optionalCustomer = this.customerRepository.findById(customerId);
		
		if(optionalCustomer.isPresent()) {
			Customer customer = optionalCustomer.get();
			Iterable<Order> itOrder = this.orderRepository.findAll();
			itOrder.forEach(order -> {
				if(order.getCustomer().getId() == customer.getId()) {
					orderList.add(order);
				}
			});
		}
		
		return orderList;
	}
}

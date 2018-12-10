package com.jkim176.project2.common.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jkim176.project2.common.data.entity.Order;
import com.jkim176.project2.common.service.OrderService;

@RestController
@RequestMapping(value="/api")
public class OrderServiceController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method=RequestMethod.GET, value="/orders/{id}")
	public List<Order> getOrdersByCustomer(@PathVariable("id") long id) {
		return this.orderService.findAllOrderByCustomer(id);
	}
}

package com.jkim176.project2.common.data.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.jkim176.project2.common.data.entity.Order;

@Repository
public interface OrderRepository extends MyBaseRepository<Order, Long> {

	Optional<Order> findById(Long id);
	Iterable<Order> findAll();
}

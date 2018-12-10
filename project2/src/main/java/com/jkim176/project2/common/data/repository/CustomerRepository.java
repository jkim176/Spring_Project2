package com.jkim176.project2.common.data.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.jkim176.project2.common.data.entity.Customer;

@Repository
public interface CustomerRepository extends MyBaseRepository<Customer, Long> {
	
	Optional<Customer> findById(Long id);
	Iterable<Customer> findAll();
}

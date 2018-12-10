package com.jkim176.project2.common.data.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import com.jkim176.project2.common.data.entity.Customer;

@NoRepositoryBean
public interface MyBaseRepository<T, ID extends Serializable> extends Repository<T, ID> {
	
	Optional<T> findById(ID id);
	Iterable<T> findAll();
}

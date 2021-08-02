package com.swim.customermanager.repository;

import org.springframework.data.repository.CrudRepository;

import com.swim.customermanager.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}

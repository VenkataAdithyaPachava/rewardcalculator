package com.rewards.rewardcalculator.repository;

import org.springframework.data.repository.CrudRepository;

import com.rewards.rewardcalculator.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    public Customer findByCustomerId(Long customerId);
}

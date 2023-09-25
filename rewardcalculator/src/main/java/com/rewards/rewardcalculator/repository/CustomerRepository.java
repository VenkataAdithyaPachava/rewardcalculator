package com.rewards.rewardcalculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rewards.rewardcalculator.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    public Customer findByCustomerId(Long customerId);
}

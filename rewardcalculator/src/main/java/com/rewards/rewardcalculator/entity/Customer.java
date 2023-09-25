package com.rewards.rewardcalculator.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;

}
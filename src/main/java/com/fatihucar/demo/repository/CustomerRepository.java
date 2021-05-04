package com.fatihucar.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatihucar.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

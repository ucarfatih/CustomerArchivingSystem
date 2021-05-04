package com.fatihucar.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatihucar.demo.exception.ResourceNotFoundException;
import com.fatihucar.demo.model.Customer;
import com.fatihucar.demo.repository.CustomerRepository;

import javassist.NotFoundException;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@GetMapping(path = "/customers")
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@GetMapping(path = "/customer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable(value = "id") Long customerId)
			throws NotFoundException, ResourceNotFoundException {
		final Customer customer = customerRepository.findById(customerId)
				.orElseThrow(() -> new ResourceNotFoundException("not found"));
		return ResponseEntity.ok().body(customer);
	}
}

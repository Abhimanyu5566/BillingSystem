package com.billingSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.billingSystem.Entity.Customer;
import com.billingSystem.Service.Impl.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer c) {
		return customerServiceImpl.addCustomer(c);
		
	}

}

package com.billingSystem.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billingSystem.Entity.Customer;
import com.billingSystem.Repository.CustomerRepository;
import com.billingSystem.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	

	@Override
	public Customer addCustomer(Customer c) {
		// TODO Auto-generated method stub
		return customerRepository.save(c);
	}
	

}

package com.billingSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.billingSystem.Entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
//	public String findByCustomerPhoneNo(cphone);

}

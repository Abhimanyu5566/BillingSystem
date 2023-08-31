package com.billingSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.billingSystem.Entity.OrderItems;
import com.billingSystem.Service.Impl.OrderitemServiceImpl;

@RestController
public class OrderitemConntroller {
	
	@Autowired
	OrderitemServiceImpl orderitemServiceImpl;
	
	@PostMapping("/order")
	public OrderItems addNewOrderitems(@RequestBody OrderItems odItems) {
		
		return orderitemServiceImpl.addOrderitem(odItems);
	}

}

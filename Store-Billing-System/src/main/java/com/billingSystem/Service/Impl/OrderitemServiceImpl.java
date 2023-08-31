package com.billingSystem.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billingSystem.Entity.OrderItems;
import com.billingSystem.Repository.OrderitemsRepository;
import com.billingSystem.Service.OrderItemsService;

@Service
public class OrderitemServiceImpl implements OrderItemsService{
	
	@Autowired
	OrderitemsRepository orderitemsRepository;
	

	@Override
	public OrderItems addOrderitem(OrderItems od) {
		// TODO Auto-generated method stub
		orderitemsRepository.save(od);
		return null;
	}
	
	

}

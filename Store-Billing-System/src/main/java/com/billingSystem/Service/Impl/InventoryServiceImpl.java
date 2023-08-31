package com.billingSystem.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.billingSystem.Entity.Inventory;
import com.billingSystem.Repository.InventoryRepository;
import com.billingSystem.Service.InventoryService;

public class InventoryServiceImpl implements InventoryService{
	
	@Autowired
	InventoryRepository inventoryRepository;

	@Override
	public String addProduct(Inventory in) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory getAllproduct() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

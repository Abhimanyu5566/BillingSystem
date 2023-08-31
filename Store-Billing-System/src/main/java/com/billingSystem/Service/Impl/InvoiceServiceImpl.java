package com.billingSystem.Service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billingSystem.Entity.Customer;
import com.billingSystem.Entity.Inventory;
import com.billingSystem.Entity.Invoice;
import com.billingSystem.Entity.OrderItems;
import com.billingSystem.Repository.CustomerRepository;
import com.billingSystem.Repository.InventoryRepository;
import com.billingSystem.Repository.InvoiceRepository;
import com.billingSystem.Service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	
	
	@Autowired
	InvoiceRepository invoiceRepository;
	
	@Autowired 
	CustomerRepository customerRepository;
	
	@Autowired
	InventoryRepository inventoryRepository;

	@Override
	public Invoice addinvoice (Invoice i) {
		// TODO Auto-generated method stub
		
		for(OrderItems orderItems : i.getOrderItems()) {
			Inventory inventory = new Inventory();
			
			Optional<Inventory> optional = inventoryRepository.findById(orderItems.getProductId());
			if (optional.isPresent()) {
				
				Inventory in = optional.get();
				
				if (in.getStock() >= orderItems.getQty()) {
					
					in.setStock(in.getStock() - orderItems.getQty());
					inventoryRepository.save(in);
					
					
				}else {
					
					System.out.println("Avaliable stock is :- "+in.getStock());
					
					
				}
			}else {
				
				System.out.println("Enter product id is not present in Inventory");
			}
			
		}
		
		return invoiceRepository.save(i);
	}
 
}

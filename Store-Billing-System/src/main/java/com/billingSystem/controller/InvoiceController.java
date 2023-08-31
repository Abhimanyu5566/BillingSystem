package com.billingSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.billingSystem.Entity.Invoice;
import com.billingSystem.Service.Impl.InvoiceServiceImpl;

@RestController
public class InvoiceController {
	
	@Autowired
	InvoiceServiceImpl invoiceServiceImpl;
	
	@PostMapping("/Invoice")
	public Invoice addNewInvoices(@RequestBody Invoice in) {
		
		return invoiceServiceImpl.addinvoice(in);
	}

}

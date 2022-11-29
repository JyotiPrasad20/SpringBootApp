package com.springProject.SpringOrder.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springProject.SpringOrder.Service.InvoiceService;
import com.springProject.SpringOrder.model.Invoice;
 
@RestController
@RequestMapping("/invoice")
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceservice;
	
	@GetMapping(produces ="application/json")	
	public Collection<Invoice> getAllInvoices(){
		return invoiceservice.getAllInvoice();
	}
	
//	@GetMapping(value="customer/{id}", produces = "application/json")
//	public Collection<Invoice> getAllCustomerInvoices(@PathVariable String id){
//		return invoiceservice.getAllCustomerInvoices(id);
//	}
}
 
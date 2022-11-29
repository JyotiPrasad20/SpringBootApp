package com.springProject.SpringOrder.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springProject.SpringOrder.Repository.InvoiceDao;
import com.springProject.SpringOrder.model.Invoice;


@Service
public class InvoiceService {

	@Autowired
	private InvoiceDao invoicedao;
	
	
	public Collection<Invoice> getAllInvoice() {
		// TODO Auto-generated method stub
		return invoicedao.getAllInvoice();
	}

}

package com.springProject.SpringOrder.Repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springProject.SpringOrder.model.Invoice;

@Repository
public class InvoiceDao {
	
	@Autowired
	private JdbcTemplate jdbctemplate;

	public Collection<Invoice> getAllInvoice() {
		// TODO Auto-generated method stub
		return jdbctemplate.query("select ord_no, ord_date, cust_id, pno, qty, amount from invoices", new BeanPropertyRowMapper());
	}

	
	 
}

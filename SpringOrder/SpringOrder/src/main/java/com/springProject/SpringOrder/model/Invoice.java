package com.springProject.SpringOrder.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Id;

public class Invoice {

	private int orderno;
	private LocalDate orderDate;
	private String cust_id;
	private int pno;
	private int quantity;
	private double amount;
	
	@Id
	@Column(name="ord_no")
	public int getOrderno() {
		return orderno;
	}
	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}
	
	@Column(name="ord_date")
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
	
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	
	@Column(name="qty")
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Column(name="amt")
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Invoice [orderno=" + orderno + ", orderDate=" + orderDate + ", cust_id=" + cust_id + ", pno=" + pno
				+ ", quantity=" + quantity + ", amount=" + amount + "]";
	}
	
	
	
	
	
}

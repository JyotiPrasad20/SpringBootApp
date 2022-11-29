package com.springProject.SpringOrder.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	private int orderno;
	private LocalDate date;
	private int Quantity;
	
	@Id
	@Column(name="ord_no")
	public int getOrderno() {
		return orderno;
	}
	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}
	
	@Column(name="ord_date")
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Column(name="qty")
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	private Customer customer;

	@ManyToOne(targetEntity =Customer.class, cascade = {CascadeType.ALL})
	@JoinColumn(name ="cust_id")
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	private Product product;

	@ManyToOne(targetEntity =Product.class,  cascade = {CascadeType.ALL})
	@JoinColumn(name ="pno")
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	@Override
	public String toString() {
		return "Order [orderno=" + orderno + ", date=" + date + ", Quantity=" + Quantity + ", customer=" + customer
				+ ", product=" + product + "]";
	}
	
	
	

}

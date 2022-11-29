package com.springProject.SpringOrder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {

	private String cid;
	private String pwd;
	private String email;
	private double credit;
	
	
	@Id
	@Column(name="cust_id", length=8)
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	
	
	@Column(name="pwd", length=16, nullable= true)
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Column(name="email", length=16, nullable= true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="credit")
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", pwd=" + pwd + ", email=" + email + ", credit=" + credit + "]";
	}
	
	
	
	
	
}

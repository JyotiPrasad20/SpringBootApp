package com.springProject.SpringOrder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="counters")
public class Counter {
	private String name;
	private int val;
	
	

	@Column(name = "ctr_name")
	public String getName() {
		return name;
	}
	public void setName(String ctr_name) {
		this.name = ctr_name;
	}
	
	@Id
	@Column(name = "ctr_val")
	public int getVal() {
		return val;
	}
	public void setVal(int ctr_val ) {
		this.val = ctr_val;
	}
	@Override
	public String toString() {
		return "Counter [name=" + name + ", val=" + val + "]";
	}
	
	

}

package com.springProject.SpringOrder.Service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springProject.SpringOrder.Repository.OrderRepo;
import com.springProject.SpringOrder.model.Customer;
import com.springProject.SpringOrder.model.Order;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepo orderrepo;

	public Collection<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderrepo.findAll();
	}

	public Collection<Order> getOrderByCustomer(String id){
		// TODO Auto-generated method stub
	    Customer customer  = new Customer();
	    customer.setCid(id);
		return orderrepo.findAllByCustomer(customer);
	}
	
	public Order getOrderById(int id) {
		// TODO Auto-generated method stub
		return orderrepo.findByOrderno(id);
	}



//	public Object SaveOrders(Order order) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	



}

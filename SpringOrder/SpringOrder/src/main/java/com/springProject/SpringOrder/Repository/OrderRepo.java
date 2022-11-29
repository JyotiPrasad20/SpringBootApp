package com.springProject.SpringOrder.Repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springProject.SpringOrder.model.Customer;
import com.springProject.SpringOrder.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

	
	Collection<Order> findAllByCustomer(Customer customer);
    
    Order findByOrderno(int n);
	
}

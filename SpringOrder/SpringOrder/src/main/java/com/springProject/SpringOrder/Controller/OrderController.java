package com.springProject.SpringOrder.Controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springProject.SpringOrder.Service.OrderService;
import com.springProject.SpringOrder.model.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderservice;
	
	@GetMapping(produces ="application/json")
	public Collection<Order> getAllOrders(){
		return orderservice.getAllOrders();
	}
	
	@GetMapping(value="customer/{id}", produces = "application/json")
	public Collection<Order> getOrderByCustomer(@PathVariable String id){
		
		return orderservice.getOrderByCustomer(id);
	}
	
	@GetMapping(value="{id}", produces = "application/json")
	public Order getOrderById(@PathVariable int id){
		return orderservice.getOrderById(id);
	}
	
	
//	@PostMapping(consumes = "application/json")
//	public void saveOrders(@RequestBody Order order){
//		 orderservice.SaveOrders(order);
//	}
}

package com.springProject.SpringOrder.Controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springProject.SpringOrder.Repository.ProductRepo;
import com.springProject.SpringOrder.Service.ProductService;
import com.springProject.SpringOrder.model.Product;

@RestController
//@RequestMapping("/product")
public class ProductController {

	
//	@Autowired
//	private ProductService productservice;
//	
//	@GetMapping(produces="application/json")
//	public String viewHomePage(Model model){
//		model.addAttribute("productlist", productservice.getAllProduct());
//		return "index";
//	}
	@Autowired
	private ProductRepo productrepo;
	
	@GetMapping(value ="/product")
	public  Collection<Product> getproducts(Model model){
		
		return productrepo.findAll();
		
	}
	
//	@PostMapping(value ="/save")
//	public String saveProduct(@RequestBody Product product){
//		productrepo.save(product);
//		return "saved";
//	}
	

}


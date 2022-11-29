package com.springProject.SpringOrder.Service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springProject.SpringOrder.Repository.ProductRepo;
import com.springProject.SpringOrder.model.Product;


@Service
@Transactional
public class ProductServiceImp implements ProductService{

	@Autowired
	private  ProductRepo productrepo;

	@Override
	public Collection<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productrepo.findAll();
	}

			
}

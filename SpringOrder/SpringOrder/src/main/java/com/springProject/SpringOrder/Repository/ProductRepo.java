package com.springProject.SpringOrder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springProject.SpringOrder.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}

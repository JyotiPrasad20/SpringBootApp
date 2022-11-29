package com.springProject.SpringOrder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springProject.SpringOrder.model.Product;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String loginPage(Model model){
//		Product product = new Product();
//		model.addAttribute("product", product);
		
		return "Front";
		
	}
}

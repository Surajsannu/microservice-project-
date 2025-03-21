package com.example.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@GetMapping
  public String getProducts() {
		return "List of products from product services";
	}
	@GetMapping("/status")
	public String getProductStatus() {
		return "Product service is up and running";
		
	}

}

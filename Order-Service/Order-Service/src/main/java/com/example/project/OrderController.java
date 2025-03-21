package com.example.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	private final ProductClient productClient;
	public OrderController (ProductClient productClient) {
		this.productClient = productClient;
	}
	
@GetMapping("/status")
public String orderStatus() {
	return "Order service is up and running";
}
@GetMapping("/call-product")
public String callProductService() {
	return "Order service calling" + productClient.getProductStatus();
	
}
}

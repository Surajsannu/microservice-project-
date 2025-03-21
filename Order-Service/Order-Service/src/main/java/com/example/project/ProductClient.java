package com.example.project;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name = "product-service")
public interface ProductClient {
	@GetMapping("/products/status")
String getProductStatus();	

}

package com.example.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/product/{id}/")
	public String getProduct(@PathVariable int id) {
		
		Product product = new Product();
		product.setId(id);
		product.setProductName("Uva");
		product.setPrice(5.00);
		
		
		return product.toString();
		
	}

}

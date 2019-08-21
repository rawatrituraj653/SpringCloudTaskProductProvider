package com.prod.producer.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prod.producer.model.Product;
import com.prod.producer.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/saveProduct")
	public String saveProduct(@RequestBody Product product ) {
		
		Integer id=productService.saveProduct(product);
		
		if(id>0) {
			
			return "Product is saved with id:: "+id;
		}
		else {
			return "product saving process getting error sorry";
		}
	}
	
	public String saveDummy(@RequestBody Product product) {
		
		return "Exception is raised or Server down try after some time";
		
	}
}

package com.ust.securityh2.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.securityh2.model.Product;
import com.ust.securityh2.service.ProductService;


@RestController
@RequestMapping("/product/api.1.0") 
public class ProductController {
	
	
	@Autowired
	private ProductService service;

	Logger logger=Logger.getLogger("ProductController.class");
	@PostMapping(value = "/addProduct",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> addProduct(@RequestBody Product newProduct) {
    Product savedProduct = service.addProduct(newProduct);
    logger.info("Persisted Product:"+ savedProduct);
    
    return ResponseEntity.status(201).body(savedProduct);

}
	@GetMapping(value = "/displayProduct", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> displayProduct() {
	    return ResponseEntity.ok(service.displayProduct());
	}


	
	
	@DeleteMapping(value = "/deleteProduct/{productId}", 
            produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<String> deleteProduct(@PathVariable("productId") int productId) {
	return null;
}

	
	
}


	



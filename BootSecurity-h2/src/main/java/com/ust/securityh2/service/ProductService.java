package com.ust.securityh2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.securityh2.model.Product;
import com.ust.securityh2.repo.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public Product addProduct(Product newProduct) {
		return repository.save(newProduct);
	}
	public List<Product> displayProduct() {
		return repository.findAll();
	}

}

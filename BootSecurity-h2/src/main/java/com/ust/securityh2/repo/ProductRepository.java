package com.ust.securityh2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.securityh2.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

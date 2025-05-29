package com.data.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.data.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
  
    List<Product> getProductByproName(String name);
    @Query("SELECT p FROM Product p JOIN FETCH p.category")
    List<Product> findAllWithCategory();

}

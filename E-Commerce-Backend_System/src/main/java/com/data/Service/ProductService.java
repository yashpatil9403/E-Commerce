package com.data.Service;

import com.data.Entity.Product;
import com.data.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
     ProductRepository productsRepository;

    public List<Product> saveProduct(List<Product> product) {
        return productsRepository.saveAll(product);
    }

   
    
    public List<Product> getAllProducts() {
        return productsRepository.findAllWithCategory();
    }


    public List<Product> getProductByName(String name) {
       return productsRepository.getProductByproName(name);
    }

   

    public Product updateProduct(Integer id, Product productDetails) {
        return productsRepository.findById(id)
                .map(product -> {
                    product.setProName(productDetails.getProName());
                    product.setProDescrip(productDetails.getProDescrip());
                    product.setProDiscount(productDetails.getProDiscount());
                    product.setProQuantity(productDetails.getProQuantity());
                    product.setCategory(productDetails.getCategory());
                    return productsRepository.save(product);
                })
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

    public void deleteProduct(Integer id) {
        productsRepository.deleteById(id);
    }
}

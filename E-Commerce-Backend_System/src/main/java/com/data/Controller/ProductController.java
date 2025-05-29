package com.data.Controller;

import com.data.Entity.Product;
import com.data.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
   ProductService productsService;

    @PostMapping
    public String createProduct(@RequestBody List<Product> products) {
    	
    	productsService.saveProduct(products);
       return "Product added successfully";
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productsService.getAllProducts();
    }

    @GetMapping("/{name}")
    public List<Product> getProductByName(@PathVariable String name) {
        return productsService.getProductByName(name);
                
    }

    

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable Integer id, @RequestBody Product product) {
         productsService.updateProduct(id, product);
         return "Product updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        productsService.deleteProduct(id);
        return "Product deleted successfully";
    }
}


package com.data.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.data.Entity.Category;
import com.data.Service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	
	@Autowired
    private CategoryService categoryService;

    @PostMapping
    public String createCategory(@RequestBody Category category) {
        categoryService.saveCategory(category);
        return "Category is save";
    }
    
    @PostMapping("/saveAll")
    public String createCategory(@RequestBody List<Category> category) {
       categoryService.saveAllCategory(category);
       return "Save all categories";
    }

    @PutMapping("/{id}")
    public String updateCategory(@PathVariable Integer id, @RequestBody Category category) {
        categoryService.updateCategory(id, category);
        return "Updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable Integer id) {
        categoryService.deleteCategory(id);
        return "Deleted Successfully";
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Integer id) {
        return categoryService.getCategoryById(id);
    }

}

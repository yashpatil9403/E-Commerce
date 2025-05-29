package com.data.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.Entity.Category;
import com.data.Repository.CategoryRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class CategoryService {
	
	 @Autowired
	  CategoryRepository categoryRepository;
	 

	
	public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
	
	public List<Category> saveAllCategory(List<Category> category) {
        return categoryRepository.saveAll(category);
    }
	
	
	@Transactional
	public Category getCategoryWithProducts(String catTitle) {
	    return categoryRepository.findByCatTitleFetchProducts(catTitle)
	             .orElseThrow(() -> new EntityNotFoundException("Category not found"));
	}


    
    public Category updateCategory(Integer id, Category category) {
        Optional<Category> existingCategory = categoryRepository.findById(id);
        if (existingCategory.isPresent()) {
            Category updated = existingCategory.get();
            updated.setCatTitle(category.getCatTitle());
            updated.setCatDescrip(category.getCatDescrip());
            return categoryRepository.save(updated);
        } else {
            throw new RuntimeException("Category not found with id: " + id);
        }
    }

    
    public String deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
        return "Category with id " + id + " deleted successfully!";
    }

    
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    
    public Category getCategoryById(Integer id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + id));
    }

}

package com.data.Repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.data.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	@Query("SELECT c FROM Category c LEFT JOIN FETCH c.products WHERE c.catTitle = :catTitle")
	Optional<Category> findByCatTitleFetchProducts(@Param("catTitle") String catTitle);

	
}

package com.data.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer catId;
	private String catTitle;
	private String catDescrip;
	
	@OneToMany(mappedBy="category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Product> products=new ArrayList<>();
	

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(Integer catId, String catTitle, String catDescrip) {
		super();
		this.catId = catId;
		this.catTitle = catTitle;
		this.catDescrip = catDescrip;
		
	}

	public Integer getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getCatTitle() {
		return catTitle;
	}

	public void setCatTitle(String catTitle) {
		this.catTitle = catTitle;
	}

	public String getCatDescrip() {
		return catDescrip;
	}

	public void setCatDescrip(String catDescrip) {
		this.catDescrip = catDescrip;
	}
	
	
	
	
}

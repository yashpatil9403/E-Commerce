package com.data.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer proId;
	private String proName;
	private String proDescrip;
	private Integer proDiscount;
	private Integer proQuantity;
	
	@ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
	public Category category;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer proId, String proName, String proDescrip, Integer proDiscount,
			Integer proQuantity,Category category) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proDescrip = proDescrip;
		this.proDiscount = proDiscount;
		this.proQuantity = proQuantity;
		this.category=category;
	}

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProDescrip() {
		return proDescrip;
	}

	public void setProDescrip(String proDescrip) {
		this.proDescrip = proDescrip;
	}

	public Integer getProDiscount() {
		return proDiscount;
	}

	public void setProDiscount(Integer proDiscount) {
		this.proDiscount = proDiscount;
	}

	public Integer getProQuantity() {
		return proQuantity;
	}

	public void setProQuantity(Integer proQuantity) {
		this.proQuantity = proQuantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
	
	

}

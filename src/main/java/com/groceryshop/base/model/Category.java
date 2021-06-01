package com.groceryshop.base.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Category  extends Base {

	
	@Column(name="categorycode")
    private String categorycode;
     
    @Column(name="category")
    private String category;
    
    
    @Column(name="description")
    private String description;

    
    @Column(name = "image", length = 1000)
	private byte[] image;

	

	public String getCategorycode() {
		return categorycode;
	}


	public void setCategorycode(String categorycode) {
		this.categorycode = categorycode;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	
	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}



	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Category(String categorycode, String category, String description, byte[] image) {
		super();
		this.categorycode = categorycode;
		this.category = category;
		this.description = description;
		this.image = image;
	}
	
	
    
    
    
}

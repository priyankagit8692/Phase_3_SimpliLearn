package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	    @Id
	    @GeneratedValue
	    private int id;

	    private String productName;
	    private String brand;
	    private String mLocation;
	    private String price;
	    private String purchaseDate;

	    public Product() {
	    }

	    public Product(String productName, String brand, String mLocation, String price, String purchaseDate) {
	        this.productName = productName;
	        this.brand = brand;
	        this.mLocation = mLocation;
	        this.price = price;
	        this.purchaseDate = purchaseDate;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	   

	    public String getmLocation() {
			return mLocation;
		}

		public void setmLocation(String mLocation) {
			this.mLocation = mLocation;
		}

		public String getPrice() {
	        return price;
	    }

	    public void setPrice(String price) {
	        this.price = price;
	    }

	    public String getPurchaseDate() {
	        return purchaseDate;
	    }

	    public void setPurchaseDate(String purchaseDate) {
	        this.purchaseDate = purchaseDate;
	    }
}

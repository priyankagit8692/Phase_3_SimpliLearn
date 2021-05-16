package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Product;

public interface ProductRepo extends CrudRepository<Product, Integer>{

	public Product findById(int id);
	public List<Product> findByProductNameOrBrandOrPurchaseDate(String productName,String brand,String date);
}

package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Product;
import com.model.User;
import com.repository.ProductRepo;
import com.repository.UserRepo;

@Service
public class SportyService {

	@Autowired
    private UserRepo userRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	public boolean register(String email, String password, String name, String address, String phone) {
        if (name.equals("") || email.equals("") || password.equals("") || address.equals("") || phone.equals(""))
            return false;

        User user = new User(email, password, name, address, phone);
        userRepo.save(user);
        return true;
    }

	public boolean loginCheck(String email,String password) {
		User user = userRepo.findByEmail(email);
		if(user != null && user.getEmail().equals(email) && user.getPassword().equals(password)){
			return true;
		}
		return false;
	}
	
	 public boolean isAdmin(String email, String password) {
	        return (email.equals("testing@gmail.com") || (email.equals("test@gmail.com")));
	    }

	public boolean addProducts(String name, String brand, String mLocation, String price, String date) {
		if (name.equals("") || brand.equals("") || mLocation.equals("") || price.equals("") || date.equals(""))
            return false;
		
		Product product = new Product(name, brand, mLocation, price, date);
		 try {
	            productRepo.save(product);
	            return true;
	        } 
		 catch (Exception e) {
	            return false;
	     }
	}
	
	public List<Product> getAllProducts(){
		return (List<Product>) productRepo.findAll();
	}
	public String getUserName(String email) {
		User user = userRepo.findByEmail(email);
		return user.getName();
	}

	public boolean updateProduct(int id,String name,String brand,String mLocation,String price, String date) {
		
	try{
		
		Product product = productRepo.findById(id);
		
		product.setProductName(name);
		product.setBrand(brand);
		product.setmLocation(mLocation);
		product.setPrice(price);
		product.setPurchaseDate(date);
		productRepo.save(product);
		return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	public Object getAllProductById(int id) {
		
		return productRepo.findById(id);
	}

	public boolean deleteProduct(int id) {
		try {
			productRepo.deleteById(id);
			return true;
		}
		catch(Exception e) {
			return false;
		}
		
		
	}

	public boolean changePassword(String email, String cPassword, String nPassword, String rPassword) {
		try {
			if(nPassword.equals(rPassword)) {
				User user = userRepo.findByEmail(email);
				if(user.getPassword().equals(cPassword)) {
					user.setPassword(nPassword);
					userRepo.save(user);
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
		
	}

	public List<Product> searchProduct(String name) {
		// TODO Auto-generated method stub
		return productRepo.findByProductNameOrBrandOrPurchaseDate(name, name, name);
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>();
		for(User user : userRepo.findAll()) {
			if(!(user.getEmail().equals("testing@gmail.com")) && !(user.getEmail().equals("test@gmail.com"))){
				users.add(user);
			}
		}
		return users;
	}
	
	public List<User> userSearch(String name){
		return userRepo.findByEmailOrNameOrPhone(name,name,name);
	}
	
}

package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.repository.UserRepo;
import com.service.SportyService;

@Controller
@RequestMapping("/mainApplication")
public class ManagingController {
	
		@Autowired
		SportyService sportyService;

	    @GetMapping("/home")
	    public String home() {
	        return "home";
	    }

	    @GetMapping("/register")
	    public String register() {
	        return "register";
	    }
	    
	    @GetMapping("/login")
	    public String login() {
	        return "login";
	    }
	    
	    @GetMapping("/addProducts")
	    public String addProducts() {
	        return "addProducts";
	    }
	    
	    @GetMapping("/adminHome")
	    public String adminHome(ModelMap map) {
	    	map.put("products",sportyService.getAllProducts());
	    	System.out.println(sportyService.getAllProducts().size());
	        return "adminHome";
	    }
	    
	    @GetMapping("/updateProduct")
	    public String updateProduct(@RequestParam int id,ModelMap map) {
	    	map.put("product",sportyService.getAllProductById(id));
	    	
	        return "updateProduct";
	    }
	    
	    @GetMapping("/deleteProduct")
	    public String deleteProduct(@RequestParam int id,ModelMap map) {
	    	if(sportyService.deleteProduct(id)) {
	    		map.put("message","Product deleted with id "+id);
	    	}else
	    	{
	    		map.put("message","Product not deleted with id "+id);
	    	}
	    	 map.put("products", sportyService.getAllProducts());
	         return "redirect:/mainApplication/adminHome";
	    }
	    
	    @GetMapping("/changePassword")
	    public String changePassword() {
	    	return "changePassword";
	    }
	    
	    @GetMapping("/userHome")
	    public String userHome(ModelMap map) {
	    	map.put("products",sportyService.getAllProducts());
	    	return "userHome";
	    }
	    
	    
	    @GetMapping("/userList")
	    public String userList(ModelMap map) {
	    	map.put("users",sportyService.getAllUsers());
	    	return "userList";
	    }
	    
	    @GetMapping("/login{logout}")
	    public String login(@PathVariable("logout") String logout, ModelMap map) {
	       
	        if(logout.contains("logout"))
	            map.put("logout","Logged out successfully");
	        return "login";
	    }
}

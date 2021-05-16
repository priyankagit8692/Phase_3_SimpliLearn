package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.service.SportyService;

@Controller
@SessionAttributes("name")
@RequestMapping("/mainApplication")
public class MainAppController {

	private String loggedInEmailId = "";
	@Autowired
	SportyService sportyService;
	
	
	@PostMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/register")
    public String register(@RequestParam("email") String email, @RequestParam("password") String password,
                           @RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("phone") String phone) {
        if (sportyService.register(email, password, name, address, phone)) {
            return "regSuccess";
        } else {
            return "Please try again";
        }
    }
    
    @PostMapping("/login")
    public String login(@RequestParam("email") String email,@RequestParam("password") String password,ModelMap map) {
    	if(sportyService.loginCheck(email, password)) {
    		map.put("name",sportyService.getUserName(email));
    		loggedInEmailId = email;
    		if(sportyService.isAdmin(email, password)) {
    			return "adminHome";
    		}
    		return "redirect:/mainApplication/userHome";
    	}
    	map.put("message", "INVALID LOGIN CREDENTIALS");
        return "login";
    }
    
    @PostMapping("/addProducts")
    public String addProducts(@RequestParam("name") String name, @RequestParam("brand") String brand,
            @RequestParam("mLocation") String mLocation, @RequestParam("price") String price,@RequestParam("date") String date) {
        if(sportyService.addProducts(name,brand,mLocation,price,date)) {
        	return "redirect:/mainApplication/adminHome";
        }
        return "failed";
    }
    
    @PostMapping("/updateProduct")
    public String updateProduct(@RequestParam int id,@RequestParam("name") String name,@RequestParam("brand") String brand,@RequestParam("mLocation") 
    	String mLocation,@RequestParam("price") String price,@RequestParam("date") String date) {
    	if(sportyService.updateProduct(id, name, brand, mLocation, price, date)) {
    		return "redirect:/mainApplication/adminHome";
    	}
    	return "Products Not Updated";
    }
    
    @PostMapping("/changePassword")
    public String  changePassword(@RequestParam("cPassword") String cPassword,@RequestParam("nPassword") String nPassword,
    		@RequestParam("rPassword") String rPassword,ModelMap map) {
    	if(sportyService.changePassword(loggedInEmailId,cPassword,nPassword,rPassword)){
    		map.put("message", "Password changed Successfully");
    	}
    	else {
    		map.put("message", "Password not changed");
    	}
    	return "changePassword";
    }
    
    @PostMapping("/adminHome")
    public String searchProduct(@RequestParam("search") String name,ModelMap map) {
    	
    	map.put("products",sportyService.searchProduct(name));
    	return "adminHome";
    }
    
    @PostMapping("/userList")
    public String searchUser(@RequestParam("search") String name,ModelMap map) {
    	map.put("users", sportyService.userSearch(name));
        return "userList";
    }
}

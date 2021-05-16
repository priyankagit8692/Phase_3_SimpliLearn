package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Product;
import com.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{

	public User findByEmail(String mail);
	public List<User> findByEmailOrNameOrPhone(String email,String name,String phone);

}
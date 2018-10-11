package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.User;

public interface UserService {

public List <User> getAllUser ();
	
	public User getUserById (int id);
	
	public void saveOrUpdate (User user);
	
	public void deleteUser(int id);
}

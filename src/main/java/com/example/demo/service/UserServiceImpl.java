package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getAllUser() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
		
	}
	

}

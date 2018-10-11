package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Role;
import com.example.demo.repository.RoleRepository;



public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleRepository roleRepository;


	@Override
	public List<Role> getAllRole() {
			return (List<Role>) roleRepository.findAll();
	}

	@Override
	public Role getRoleById(int id) {
		return roleRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Role role) {
		roleRepository.save(role);
	}

	@Override
	public void deleteRole(int id) {
		roleRepository.deleteById(id);
		
	}

}

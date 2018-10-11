package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Roditelj;
import com.example.demo.repository.RoditeljRepository;

public class RoditeljServiceImpl implements RoditeljService {
	
	@Autowired
	RoditeljRepository roditeljRepository;

	@Override
	public List<Roditelj> getAllRoditelj() {
		return (List<Roditelj>) roditeljRepository.findAll();
	}

	@Override
	public Roditelj getRoditeljById(int id) {
		return roditeljRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Roditelj roditelj) {
		roditeljRepository.save(roditelj);
	}

	@Override
	public void deleteRoditelj(int id) {
		roditeljRepository.deleteById(id);
	}

}

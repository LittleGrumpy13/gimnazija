package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.entities.Uplate;
import com.example.demo.repository.UplateRepository;

public class UplateServiceImpl implements UplateService {
	
	@Autowired
	UplateRepository uplateRepository;
	
	@Override
	public List<Uplate> getAllUplate() {
		return (List<Uplate>) uplateRepository.findAll();
	}


	@Override
	public Uplate getUplateById(int id) {
		return uplateRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Uplate uplate) {
		uplateRepository.save(uplate);
		
	}

	@Override
	public void deleteUplate(int id) {
		uplateRepository.deleteById(id);
		
	}


}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Odeljenje;
import com.example.demo.repository.OdeljenjeRepository;

public class OdeljenjeServiceImpl implements OdeljenjeService {
	
	@Autowired
	OdeljenjeRepository odeljenjeRepository;
	

	@Override
	public List<Odeljenje> getAllOdeljenje() {
		return (List<Odeljenje>) odeljenjeRepository.findAll();
	}

	@Override
	public Odeljenje getOdeljenjeById(int id) {
		return odeljenjeRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Odeljenje odeljenje) {
		odeljenjeRepository.save(odeljenje);
		
	}

	@Override
	public void deleteOdeljenje(int id) {
		odeljenjeRepository.deleteById(id);
		
	}
	
	
}

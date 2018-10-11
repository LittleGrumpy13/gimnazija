package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Angazovanje;
import com.example.demo.repository.AngazovanjeRepository;

public class AngazovanjeServiceImpl implements AngazovanjeService{
	
	@Autowired
	AngazovanjeRepository angazovanjeRepository;
	
	

	@Override
	public List<Angazovanje> getAllAngazovanje() {
		return (List<Angazovanje>) angazovanjeRepository.findAll();
	}

	@Override
	public Angazovanje getAngazovanjeById(int id) {
		return angazovanjeRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Angazovanje angazovanje) {
		angazovanjeRepository.save(angazovanje);
		
	}

	@Override
	public void deleteAngazovanje(int id) {
		angazovanjeRepository.deleteById(id);
		
	}
	

}

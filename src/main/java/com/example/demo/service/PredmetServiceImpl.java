package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Predmet;
import com.example.demo.repository.PredmetRepository;

public class PredmetServiceImpl implements PredmetService {
	
	@Autowired
	PredmetRepository predmetRepository;

	@Override
	public List<Predmet> getAllPredmet() {
		return (List<Predmet>) predmetRepository.findAll();
	}

	@Override
	public Predmet getPredmetById(int id) {
		return predmetRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Predmet predmet) {
		predmetRepository.save(predmet);
		
	}

	@Override
	public void deletePredmet(int id) {
		predmetRepository.deleteById(id);
		
	}


}

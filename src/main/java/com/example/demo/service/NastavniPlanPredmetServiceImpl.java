package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.NastavniPlanPredmet;
import com.example.demo.repository.NastavniPlanPredmetRepository;

public class NastavniPlanPredmetServiceImpl implements NastavniPlanPredmetService{

	@Autowired
	NastavniPlanPredmetRepository nastavniPlanPredmetRepository;
	
	
	@Override
	public List<NastavniPlanPredmet> getAllNastavniPlanPredmet() {
		return (List<NastavniPlanPredmet>) nastavniPlanPredmetRepository.findAll();
	}

	@Override
	public NastavniPlanPredmet getNastavniPlanPredmetById(int id) {
		return nastavniPlanPredmetRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(NastavniPlanPredmet nastavniPlanPredmet) {
		nastavniPlanPredmetRepository.save(nastavniPlanPredmet);
		
	}

	@Override
	public void deleteNastavniPlanPredmet (int id) {
		nastavniPlanPredmetRepository.deleteById(id);
		
	}
	

}

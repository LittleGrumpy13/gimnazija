package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.UcenikPredmet;
import com.example.demo.repository.UcenikPredmetRepository;

public class UcenikPredmetServiceImpl implements UcenikPredmetService {
	
	@Autowired
	UcenikPredmetRepository ucenikPredmetRepository;
	
	

	@Override
	public List<UcenikPredmet> getAllUcenikPredmet() {
		return (List<UcenikPredmet>) ucenikPredmetRepository.findAll();
	}

	@Override
	public UcenikPredmet getUcenikPredmetById(int id) {
		return ucenikPredmetRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(UcenikPredmet ucenikPredmet) {
		ucenikPredmetRepository.save(ucenikPredmet);
		
	}

	@Override
	public void deleteUcenikPredmet(int id) {
		ucenikPredmetRepository.deleteById(id);
		
	}
	
}


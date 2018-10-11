package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Nastavnik;
import com.example.demo.repository.NastavnikRepository;

public class NastavnikServiceImpl implements NastavnikService {
	
	@Autowired
	NastavnikRepository nastavnikRepository;
	
	
	@Override
	public List<Nastavnik> getAllNastavnik() {
		return (List<Nastavnik>) nastavnikRepository.findAll();
	}

	@Override
	public Nastavnik getNastavnikById(int id) {
		return nastavnikRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Nastavnik nastavnik) {
		nastavnikRepository.save(nastavnik);
		
	}

	@Override
	public void deleteNastavnik(int id) {
		nastavnikRepository.deleteById(id);
	}

}

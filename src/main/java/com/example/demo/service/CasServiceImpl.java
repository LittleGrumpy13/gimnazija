package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Cas;
import com.example.demo.repository.CasRepository;

public class CasServiceImpl implements CasSrevice {
	
	@Autowired
	CasRepository casRepository;
	
	
	@Override
	public List<Cas> getAllCas() {
		return (List<Cas>) casRepository.findAll();
	}

	@Override
	public Cas getCasById(int id) {
		return casRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Cas cas) {
		casRepository.save(cas);
		
	}

	@Override
	public void deleteCas(int id) {
		casRepository.deleteById(id);
		
	}
	


}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Upis;
import com.example.demo.repository.UpisRepository;

public class UpisServiceImpl implements UpisService {

	@Autowired
	UpisRepository upisRepository;
	
	@Override
	public List<Upis> getAllUpis() {
		return (List<Upis>) upisRepository.findAll();
	}

	@Override
	public Upis getUpisById(int id) {
		return upisRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Upis upis) {
		upisRepository.save(upis);
		
	}

	@Override
	public void deleteUpis(int id) {
		upisRepository.deleteById(id);
		
	}
	
}

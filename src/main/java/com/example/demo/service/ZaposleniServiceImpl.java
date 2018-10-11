package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Zaposleni;
import com.example.demo.repository.ZaposleniRepository;

public class ZaposleniServiceImpl implements ZaposleniService{
	
	@Autowired
	ZaposleniRepository zaposleniRepository;

	@Override
	public List<Zaposleni> getAllZaposleni() {
		return (List<Zaposleni>) zaposleniRepository.findAll();
	}

	@Override
	public Zaposleni getZaposleniById(int id) {
		return zaposleniRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Zaposleni zaposleni) {
		zaposleniRepository.save(zaposleni);
		
	}

	@Override
	public void deleteZaposleni(int id) {
		zaposleniRepository.deleteById(id);
		
	}

}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Zaduzenja;
import com.example.demo.repository.ZaduzenjaRepository;

public class ZaduzenjaServiceImpl implements ZaduzenjaService  {
	
	@Autowired
	ZaduzenjaRepository zaduzenjaRepository;
	

	@Override
	public List<Zaduzenja> getAllZaduzenja() {
		return (List<Zaduzenja>) zaduzenjaRepository.findAll();
	}

	@Override
	public Zaduzenja getZaduzenjaById(int id) {
		return zaduzenjaRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Zaduzenja zaduzenja) {
		zaduzenjaRepository.save(zaduzenja);
		
	}

	@Override
	public void deleteZaduzenja(int id) {
		zaduzenjaRepository.deleteById(id);
		
	}
	

}

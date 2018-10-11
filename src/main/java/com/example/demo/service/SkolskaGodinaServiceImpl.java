package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.SkolskaGodina;
import com.example.demo.repository.SkolskaGodinaRepository;

@Service
public class SkolskaGodinaServiceImpl implements SkolskaGodinaService {

	@Autowired
	SkolskaGodinaRepository skolskaGodinaRepository;
	
	@Override
	public List<SkolskaGodina> getAllSkolskaGodina() {
		return (List<SkolskaGodina>) skolskaGodinaRepository.findAll();
	}

	@Override
	public SkolskaGodina getSkolskaGodinaById(int id) {
		return skolskaGodinaRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(SkolskaGodina skolskaGodina) {
		skolskaGodinaRepository.save(skolskaGodina);
		
	}

	@Override
	public void deleteSkolskaGodina(int id) {
		skolskaGodinaRepository.deleteById(id);
		
	}

}

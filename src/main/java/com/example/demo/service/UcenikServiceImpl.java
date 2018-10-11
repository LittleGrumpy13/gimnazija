package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Ucenik;
import com.example.demo.repository.UcenikRepository;

public class UcenikServiceImpl implements UcenikService {
	
	@Autowired
	UcenikRepository ucenikRepository;
	

	@Override
	public List<Ucenik> getAllUcenik() {
		return (List<Ucenik>) ucenikRepository.findAll();
	}

	@Override
	public Ucenik getUcenikById(int id) {
		return ucenikRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Ucenik ucenik) {
		ucenikRepository.save(ucenik);
		
	}

	@Override
	public void deleteUcenik(int id) {
		ucenikRepository.deleteById(id);
		
	}

}

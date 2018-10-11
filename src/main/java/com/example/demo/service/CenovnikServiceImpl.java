package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Cenovnik;
import com.example.demo.repository.CenovnikRepository;

@Service
public class CenovnikServiceImpl implements CenovnikService {
	
	@Autowired
	CenovnikRepository cenovnikRepository;
	

	@Override
	public List<Cenovnik> getAllCenovnik() {
		return (List<Cenovnik>) cenovnikRepository.findAll();
	}

	@Override
	public Cenovnik getCenovnikById(int id) {
		return cenovnikRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Cenovnik cenovnik) {
		cenovnikRepository.save(cenovnik);
		
	}

	@Override
	public void deleteCenovnik(int id) {
		cenovnikRepository.deleteById(id);
		
	}


}

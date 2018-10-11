package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Prisustvo;
import com.example.demo.repository.PrisustvoRepository;

public class PrisustvoServiceImpl implements PrisustvoService {
	
	@Autowired
	PrisustvoRepository prisustvoRepository;
	

	@Override
	public List<Prisustvo> getAllPrisustvo() {
		return (List<Prisustvo>) prisustvoRepository.findAll();
	}

	@Override
	public Prisustvo getPrisustvoById(int id) {
		return prisustvoRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Prisustvo prisustvo) {
		prisustvoRepository.save(prisustvo);
	}

	@Override
	public void deletePrisustvo(int id) {
		prisustvoRepository.deleteById(id);
	}

}

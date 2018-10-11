package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.RoditeljskiSastanak;
import com.example.demo.repository.RoditeljskiSastanakRepository;



public class RoditeljskiSastanakServiceImpl implements RoditeljskiSastanakService{
	
	@Autowired
	RoditeljskiSastanakRepository roditeljskiSastanakRepository;

	@Override
	public List<RoditeljskiSastanak> getAllRoditeljskiSastanak() {
		return (List<RoditeljskiSastanak>) roditeljskiSastanakRepository.findAll();
	}

	@Override
	public RoditeljskiSastanak getRoditeljskiSastanakById(int id) {
		return roditeljskiSastanakRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(RoditeljskiSastanak roditeljskiSastanak) {
		roditeljskiSastanakRepository.save(roditeljskiSastanak);
	}

	@Override
	public void deleteRoditeljskiSastanak(int id) {
		roditeljskiSastanakRepository.deleteById(id);
		
	}
	

}

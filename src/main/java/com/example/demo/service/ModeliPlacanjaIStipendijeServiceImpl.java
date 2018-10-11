package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ModeliPlacanjaIStipendije;
import com.example.demo.repository.ModeliPlacanjaIStipendijeRepository;

@Service
public class ModeliPlacanjaIStipendijeServiceImpl implements ModeliPlacanjaIStipendijeService {
	
	@Autowired
	ModeliPlacanjaIStipendijeRepository modeliPlacanjaIStipendijeRepository;
	

	@Override
	public List<ModeliPlacanjaIStipendije> getAllModeliPlacanjaIStipendije() {
		return (List<ModeliPlacanjaIStipendije>) modeliPlacanjaIStipendijeRepository.findAll();
	}

	@Override
	public ModeliPlacanjaIStipendije getModeliPlacanjaIStipendijeById(int id) {
		return modeliPlacanjaIStipendijeRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(ModeliPlacanjaIStipendije modeliPlacanjaIStipendije) {
		modeliPlacanjaIStipendijeRepository.save(modeliPlacanjaIStipendije);
		
	}

	@Override
	public void deleteModeliPlacanjaIStipendije(int id) {
		modeliPlacanjaIStipendijeRepository.deleteById(id);
	
	}
	
}

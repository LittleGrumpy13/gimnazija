package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.ModeliPlacanjaIStipendije;


public interface ModeliPlacanjaIStipendijeService {
	
	public List <ModeliPlacanjaIStipendije> getAllModeliPlacanjaIStipendije ();
	
	public ModeliPlacanjaIStipendije getModeliPlacanjaIStipendijeById (int id);
	
	public void saveOrUpdate (ModeliPlacanjaIStipendije modeliPlacanjaIStipendije);
	
	public void deleteModeliPlacanjaIStipendije(int id);

}

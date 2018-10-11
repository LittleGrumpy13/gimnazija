package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Predmet;

public interface PredmetService {
	
	public List <Predmet> getAllPredmet ();
	
	public Predmet getPredmetById (int id);
	
	public void saveOrUpdate (Predmet predmet);
	
	public void deletePredmet(int id);

}

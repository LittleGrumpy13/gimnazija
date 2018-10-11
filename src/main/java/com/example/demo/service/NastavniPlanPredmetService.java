package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.NastavniPlanPredmet;

public interface NastavniPlanPredmetService {
	
	public List <NastavniPlanPredmet> getAllNastavniPlanPredmet ();
	
	public NastavniPlanPredmet getNastavniPlanPredmetById (int id);
	
	public void saveOrUpdate (NastavniPlanPredmet nastavniPlanPredmet);
	
	public void deleteNastavniPlanPredmet(int id);

}

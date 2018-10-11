package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Cas;

public interface CasSrevice {

	public List <Cas> getAllCas ();
	
	public Cas getCasById (int id);
	
	public void saveOrUpdate (Cas cas);
	
	public void deleteCas(int id);
}

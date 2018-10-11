package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.UcenikPredmet;

public interface UcenikPredmetService {
	
	public List <UcenikPredmet> getAllUcenikPredmet ();
	
	public UcenikPredmet getUcenikPredmetById (int id);
	
	public void saveOrUpdate (UcenikPredmet ucenikPredmet);
	
	public void deleteUcenikPredmet(int id);

}

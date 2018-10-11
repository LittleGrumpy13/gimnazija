package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Angazovanje;

public interface AngazovanjeService {
	
	public List <Angazovanje> getAllAngazovanje ();
	
	public Angazovanje getAngazovanjeById (int id);
	
	public void saveOrUpdate (Angazovanje angazovanje);
	
	public void deleteAngazovanje(int id);

}

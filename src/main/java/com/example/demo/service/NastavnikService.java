package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Nastavnik;

public interface NastavnikService {
	
	public List <Nastavnik> getAllNastavnik ();
	
	public Nastavnik getNastavnikById (int id);
	
	public void saveOrUpdate (Nastavnik nastavnik);
	
	public void deleteNastavnik(int id);

}

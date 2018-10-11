package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Cenovnik;


public interface CenovnikService {
	
	public List <Cenovnik> getAllCenovnik ();
	
	public Cenovnik getCenovnikById (int id);
	
	public void saveOrUpdate (Cenovnik cenovnik);
	
	public void deleteCenovnik(int id);

}

package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Prisustvo;

public interface PrisustvoService {
	
	public List <Prisustvo> getAllPrisustvo ();
	
	public Prisustvo getPrisustvoById (int id);
	
	public void saveOrUpdate (Prisustvo prisustvo);
	
	public void deletePrisustvo(int id);

}

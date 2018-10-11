package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Ucenik;

public interface UcenikService {
	
	public List <Ucenik> getAllUcenik();
	
	public Ucenik getUcenikById (int id);
	
	public void saveOrUpdate (Ucenik ucenik);
	
	public void deleteUcenik(int id);

}

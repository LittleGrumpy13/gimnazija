package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Roditelj;

public interface RoditeljService {
	
	public List <Roditelj> getAllRoditelj ();
	
	public Roditelj getRoditeljById (int id);
	
	public void saveOrUpdate (Roditelj roditelj);
	
	public void deleteRoditelj(int id);

}

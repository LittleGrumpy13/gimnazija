package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Upis;

public interface UpisService {
	
	public List <Upis> getAllUpis ();
	
	public Upis getUpisById (int id);
	
	public void saveOrUpdate (Upis upis);
	
	public void deleteUpis(int id);

	
}

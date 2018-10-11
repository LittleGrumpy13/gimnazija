package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Odeljenje;

public interface OdeljenjeService {
	
	public List <Odeljenje> getAllOdeljenje ();
	
	public Odeljenje getOdeljenjeById (int id);
	
	public void saveOrUpdate (Odeljenje odeljenje);
	
	public void deleteOdeljenje(int id);

}

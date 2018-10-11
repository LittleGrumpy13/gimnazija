package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Uplate;

public interface UplateService {
	
	public List <Uplate> getAllUplate ();
	
	public Uplate getUplateById (int id);
	
	public void saveOrUpdate (Uplate uplate);
	
	public void deleteUplate(int id);

}

package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.SkolskaGodina;

public interface SkolskaGodinaService {
	
	public List <SkolskaGodina> getAllSkolskaGodina ();
	
	public SkolskaGodina getSkolskaGodinaById (int id);
	
	public void saveOrUpdate (SkolskaGodina skolskaGodina);
	
	public void deleteSkolskaGodina(int id);

}

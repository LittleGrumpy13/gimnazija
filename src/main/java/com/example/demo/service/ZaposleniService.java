package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Zaposleni;

public interface ZaposleniService {
	
	public List <Zaposleni> getAllZaposleni ();
	
	public Zaposleni getZaposleniById (int id);
	
	public void saveOrUpdate (Zaposleni zaposleni);
	
	public void deleteZaposleni(int id);
	

}

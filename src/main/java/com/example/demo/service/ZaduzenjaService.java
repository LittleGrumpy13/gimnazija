package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Zaduzenja;

public interface ZaduzenjaService {
	
	public List <Zaduzenja> getAllZaduzenja ();
	
	public Zaduzenja getZaduzenjaById (int id);
	
	public void saveOrUpdate (Zaduzenja zaduzenja);
	
	public void deleteZaduzenja(int id);

}

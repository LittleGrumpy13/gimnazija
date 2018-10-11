package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.RoditeljskiSastanak;

public interface RoditeljskiSastanakService {

	public List <RoditeljskiSastanak> getAllRoditeljskiSastanak ();
	
	public RoditeljskiSastanak getRoditeljskiSastanakById (int id);
	
	public void saveOrUpdate (RoditeljskiSastanak roditeljskiSastanak);
	
	public void deleteRoditeljskiSastanak(int id);
}

package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.GodisnjiPlan;

public interface GodisnjiPlanService {
	
	public List <GodisnjiPlan> getAllGodisnjiPlan ();
	
	public GodisnjiPlan getGodisnjiPlanById (int id);
	
	public void saveOrUpdate (GodisnjiPlan godisnjiPlan);
	
	public void deleteGodisnjiPlan(int id);

}

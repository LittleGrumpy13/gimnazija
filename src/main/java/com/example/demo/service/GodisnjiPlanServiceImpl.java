package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.GodisnjiPlan;
import com.example.demo.repository.GodisnjiPlanRepository;

public class GodisnjiPlanServiceImpl implements GodisnjiPlanService {

	
	@Autowired
	GodisnjiPlanRepository godisnjiPlanRepository;
	
	
	@Override
	public List<GodisnjiPlan> getAllGodisnjiPlan() {
		return (List<GodisnjiPlan>) godisnjiPlanRepository.findAll();
	}

	@Override
	public GodisnjiPlan getGodisnjiPlanById(int id) {
		return godisnjiPlanRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(GodisnjiPlan godisnjiPlan) {
		godisnjiPlanRepository.save(godisnjiPlan);
		
	}

	@Override
	public void deleteGodisnjiPlan(int id) {
		godisnjiPlanRepository.deleteById(id);
		
	}
	

}

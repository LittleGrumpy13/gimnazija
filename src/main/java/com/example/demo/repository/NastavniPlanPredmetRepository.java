package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.NastavniPlanPredmet;

@Repository
public interface NastavniPlanPredmetRepository extends JpaRepository<NastavniPlanPredmet, Integer> {

}

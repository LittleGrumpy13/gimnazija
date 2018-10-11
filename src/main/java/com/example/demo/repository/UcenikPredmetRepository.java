package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.UcenikPredmet;

@Repository
public interface UcenikPredmetRepository extends JpaRepository<UcenikPredmet, Integer>{

}

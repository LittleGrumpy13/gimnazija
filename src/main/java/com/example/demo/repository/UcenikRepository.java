package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Ucenik;

@Repository
public interface UcenikRepository extends JpaRepository<Ucenik, Integer>{

}

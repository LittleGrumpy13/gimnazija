package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Angazovanje;

@Repository
public interface AngazovanjeRepository extends JpaRepository<Angazovanje, Integer> {

}

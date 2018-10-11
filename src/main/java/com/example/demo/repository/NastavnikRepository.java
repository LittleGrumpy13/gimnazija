package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Nastavnik;

@Repository
public interface NastavnikRepository extends JpaRepository<Nastavnik, Integer> {

}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Zaduzenja;
@Repository
public interface ZaduzenjaRepository extends JpaRepository<Zaduzenja, Integer> {

}

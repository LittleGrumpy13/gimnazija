package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Upis;

@Repository
public interface UpisRepository extends JpaRepository<Upis, Integer> {

}

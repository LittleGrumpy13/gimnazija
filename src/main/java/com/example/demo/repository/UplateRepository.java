package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Uplate;
@Repository
public interface UplateRepository extends JpaRepository<Uplate, Integer>{

}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Cenovnik;

@Repository
public interface CenovnikRepository extends JpaRepository<Cenovnik, Integer> {

}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.RoditeljskiSastanak;

@Repository
public interface RoditeljskiSastanakRepository extends JpaRepository<RoditeljskiSastanak, Integer>{

}

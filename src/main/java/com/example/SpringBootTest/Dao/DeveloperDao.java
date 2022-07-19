package com.example.SpringBootTest.Dao;

import com.example.SpringBootTest.Entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperDao extends JpaRepository<Developer, Integer> {
}

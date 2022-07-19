package com.example.SpringBootTest.Dao;

import com.example.SpringBootTest.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectDao extends JpaRepository<Project, Integer> {
}

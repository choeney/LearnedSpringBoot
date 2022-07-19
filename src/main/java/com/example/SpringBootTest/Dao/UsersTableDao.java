package com.example.SpringBootTest.Dao;

import com.example.SpringBootTest.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersTableDao extends JpaRepository<Users, Integer> {
}

package com.example.SpringBootTest.Dao;

import com.example.SpringBootTest.Entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileDao extends JpaRepository<UserProfile, Integer> {
}

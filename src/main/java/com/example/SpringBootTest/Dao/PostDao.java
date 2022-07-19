package com.example.SpringBootTest.Dao;

import com.example.SpringBootTest.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDao extends JpaRepository<Post, Integer> {
}

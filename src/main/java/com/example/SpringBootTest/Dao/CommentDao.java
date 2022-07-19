package com.example.SpringBootTest.Dao;

import com.example.SpringBootTest.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentDao extends JpaRepository<Comment, Integer> {

//    List<Comment> findByPostId(Integer postId);
}

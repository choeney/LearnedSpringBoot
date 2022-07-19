package com.example.SpringBootTest.Service;

import com.example.SpringBootTest.Dao.CommentDao;
import com.example.SpringBootTest.Dao.PostDao;
import com.example.SpringBootTest.Entity.Comment;
import com.example.SpringBootTest.Entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentDao commentDao;

    @Autowired
    private PostDao postDao;


    public List<Comment> getAllCommnet(){
        return commentDao.findAll();
    }

    public Comment getCommentById(Integer id){
        return commentDao.findById(id).get();
    }

    public Post saveComment(Integer postId, Comment comment){
        commentDao.save(comment);
        Post postTOCOmment = postDao.findById(postId).get();
        postTOCOmment.getComments().add(comment);
        System.out.println((postTOCOmment.getComments()));

        return postDao.save(postTOCOmment);
    }
}

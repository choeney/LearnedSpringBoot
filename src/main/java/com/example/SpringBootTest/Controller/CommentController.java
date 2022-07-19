package com.example.SpringBootTest.Controller;

import com.example.SpringBootTest.Entity.Comment;
import com.example.SpringBootTest.Entity.Post;
import com.example.SpringBootTest.Service.CommentService;
import com.example.SpringBootTest.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public List<Comment> allComment(){
        return commentService.getAllCommnet();
    }

    @GetMapping("/comment/{id}")
    public Comment getCommentById(@PathVariable Integer id){
        return commentService.getCommentById(id);
    }

    @PostMapping("/posts/{postId}/comments")
    public Post createComment(@PathVariable Integer postId,@RequestBody Comment comment){
        return commentService.saveComment(postId, comment);
    }

}

package com.example.SpringBootTest.Controller;

import com.example.SpringBootTest.Entity.Post;
import com.example.SpringBootTest.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public List<Post> allPost(){
       return postService.getAllPost();
    }

    @GetMapping("/post/{id}")
    public Post getPostById(@PathVariable Integer id){
        return postService.getPostById(id);
    }
    @PostMapping("/")
    public Post createPost(@RequestBody Post post){
        return postService.savePost(post);
    }



}

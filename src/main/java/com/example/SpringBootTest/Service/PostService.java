package com.example.SpringBootTest.Service;

import com.example.SpringBootTest.Dao.PostDao;
import com.example.SpringBootTest.Entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostDao postDao;

    public List<Post> getAllPost(){
        return postDao.findAll();
    }

    public Post getPostById(Integer id){
        return postDao.findById(id).get();
    }

    public Post savePost(Post post){
        return postDao.save(post);
    }


}

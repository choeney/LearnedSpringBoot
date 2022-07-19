package com.example.SpringBootTest.Service;

import com.example.SpringBootTest.Dao.UserProfileDao;
import com.example.SpringBootTest.Entity.User;
import com.example.SpringBootTest.Entity.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileDao userProfileDao;

    public List<UserProfile> getAllUsers(){
        return userProfileDao.findAll();
    }

//    public UserProfile save(Integer id){
//
//    }
    public UserProfile getProfileById(Integer id){
        return userProfileDao.findById(id).get();
    }
}

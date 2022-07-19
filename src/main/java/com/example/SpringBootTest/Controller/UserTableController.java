package com.example.SpringBootTest.Controller;

import com.example.SpringBootTest.Dao.UsersTableDao;
import com.example.SpringBootTest.Entity.UserProfile;
import com.example.SpringBootTest.Entity.Users;
import com.example.SpringBootTest.Service.UserProfileService;
import com.example.SpringBootTest.Service.UserTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserTableController {

    @Autowired
    private UsersTableDao usersTableDao;

    @Autowired
    private UserProfileService userProfileService;

//    @GetMapping("/userTable")
//    public List<Users> getAllUserProfile(){
//        return userTableService.getAllUsersTable();
//    }
//
//    @GetMapping("/userTable/{id}")
//    public Users getUserById(@PathVariable Integer id){
//        return userTableService.getUserById(id);
//    }

    @GetMapping("/userTable")
    public List<Users> getAllUserswithProfile(){
//        return Arrays.asList(Users.builder().id(5).build());
        return usersTableDao.findAll();
    }

    @GetMapping("/userProfiles")
    public List<UserProfile> getAllUsersProfile(){
//        return Arrays.asList(Users.builder().id(5).build());
        return userProfileService.getAllUsers();
    }

    @GetMapping("/userTable/{id}")
    public Users getUserById(@PathVariable Integer id){
        return usersTableDao.findById(id).get();
    }
}

package com.example.SpringBootTest.Controller;

import com.example.SpringBootTest.Dao.UserDao;
import com.example.SpringBootTest.Entity.User;
import com.example.SpringBootTest.Exceptions.UserNotFoundExceptions;
import com.example.SpringBootTest.Service.UserService;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    // post : {
    //    id : 1,
    //    name : "Post1",
    //    comments : [
    //    {
    //        id : 121,
    //        description : "Looking good"
    //    },
    //    {
    //        id : 122,
    //                description : "Looking Awesome"
    //    }
    //    ]
    //  }

    @Value("${server.port}")
    private int port;
    private  static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String printSomething() {
        return "Hello World";
    }

    @PostMapping("/add")
    public ResponseEntity<Object> addUser(@RequestBody User user) {
//        if(user.getName() == ""){
//            logger.warn("Username is Empty");
//            logger.error("User is not created....");
//            return null;
//        }
        logger.info("THis Application has created One User");
        return userService.addUser(user);
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        logger.info("SpringBootTestApplication is Started on {} ",port);
//        System.out.println("Application is started on "+port);
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}/{ids}")
    public ResponseEntity<Object> getUser(@PathVariable int id)  {

        return userService.getUser(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user, @PathVariable int id) {

        return userService.updateUser(user,id);
    }

    @DeleteMapping("/{id}")
    public List<User> deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return getAllUsers();
    }

    @GetMapping("/sortById")
    public List<User> sortedUsersList(){
        return userService.sortUserById();
    }

    @GetMapping("/soft/{id}")
    public String softDelete(@PathVariable int id){
        userService.softDeleteUser(id);
        return id+" Deleted Successfully";
    }

    @GetMapping("/active")
    public List<User> getAllActiveUSers(){
        return userService.getAllActiveUsers();
    }

}
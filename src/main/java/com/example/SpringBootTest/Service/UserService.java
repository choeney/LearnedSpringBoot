package com.example.SpringBootTest.Service;

import com.example.SpringBootTest.Dao.UserDao;
import com.example.SpringBootTest.Entity.User;
import com.example.SpringBootTest.Exceptions.InvalidUsernameException;
import com.example.SpringBootTest.Exceptions.UserNotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public ResponseEntity<Object> getUser(int id) {
        Optional<User> user = userDao.findById(id);
        if(user.isPresent()){
            return new ResponseEntity<Object>(user, HttpStatus.OK);
        }else{
            throw new UserNotFoundExceptions("User Not Found with Id "+id);
        }

    }

    public User updateUser(User user, int id) {

        User u = userDao.findById(id).get();
        u.setId(id);
        u.setName(user.getName());
        u.setPhone(user.getPhone());
        return userDao.save(u);

    }
    public ResponseEntity<Object> addUser(User user) {
        if(user.getName() == ""){
            throw new InvalidUsernameException("Empty User name");
        }
        userDao.save(user);
        return new ResponseEntity<Object>(user,HttpStatus.CREATED);
    }

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public List<User> deleteUser(int id){
        userDao.deleteById(id);
        return getAllUsers();
    }

    public List<User> sortUserById(){
        Comparator<User> compareById = Comparator.comparing(User::getName);
        return getAllUsers().stream().sorted(compareById).collect(Collectors.toList());
    }

    public void softDeleteUser(int id){
         userDao.softDeleteById(id);
    }

    public List<User> getAllActiveUsers(){
        return userDao.findByActiveTrue();
    }
}

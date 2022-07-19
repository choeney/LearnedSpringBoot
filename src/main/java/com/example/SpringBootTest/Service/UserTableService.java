package com.example.SpringBootTest.Service;

import com.example.SpringBootTest.Dao.UsersTableDao;
import com.example.SpringBootTest.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTableService {

    @Autowired
    private UsersTableDao usersTableDao;

    public List<Users> getAllUsersTable(){
        return usersTableDao.findAll();
    }

    public Users saveUsers(Users users){
        return usersTableDao.save(users);
    }

    public Users getUserById(Integer id){
        return usersTableDao.findById(id).get();
    }
}

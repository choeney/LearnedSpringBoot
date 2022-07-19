package com.example.SpringBootTest.Dao;

import com.example.SpringBootTest.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

//    @Query("update user set active = false where id = :id ")
    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.active = FALSE where u.id = :user_id")
    void softDeleteById(@Param("user_id") int id);

    List<User> findByActiveTrue();


}

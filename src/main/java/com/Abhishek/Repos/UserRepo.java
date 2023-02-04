package com.Abhishek.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Abhishek.Models.User;

public interface UserRepo extends JpaRepository<User,String> {

    public User findByUsername(String username);
    
}

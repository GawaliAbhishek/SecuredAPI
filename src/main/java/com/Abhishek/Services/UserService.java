package com.Abhishek.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Abhishek.Models.User;
import com.Abhishek.Repos.UserRepo;

@Service
public class UserService {
    
    @Autowired
    UserRepo repo;

    @Autowired
    private PasswordEncoder encoder;

    public User findByUserName(String username){
        return repo.findByUsername(username);
    }

    public User addUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

}

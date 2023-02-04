package com.Abhishek.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.Abhishek.Models.CustomeUserDetails;
import com.Abhishek.Models.User;
import com.Abhishek.Services.UserService;


public class CustomUserDetailService implements UserDetailsService{

    @Autowired
    private UserService service;
  

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
           User user= service.findByUserName(username);

           if(user==null){
            throw new UsernameNotFoundException("User Not Found With Name "+ username);
           }
           
        return new CustomeUserDetails(user);
    }

}

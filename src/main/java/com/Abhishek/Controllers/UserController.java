package com.Abhishek.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Abhishek.Models.User;
import com.Abhishek.Services.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    
    @PostMapping("/public/adduser")
    public String addUserInDB ( User user){
       service.addUser(user);
       return "SIGNUP SUCCESS";
    }

    @GetMapping("/public/adduser")
    public String addUser(){
        return "login.html";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    @ResponseBody
    public String Test(){
        // ModelAndView obj =new ModelAndView();
        // obj.setViewName("login.html");
        return "ADMIN";
    }
    
}

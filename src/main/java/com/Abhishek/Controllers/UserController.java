package com.Abhishek.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Abhishek.Models.User;
import com.Abhishek.Services.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    
    @PostMapping("/public/adduser")
    public User addUserInDB (@RequestBody User user){
        return service.addUser(user);
    }

    @GetMapping("/public/adduser")
    @ResponseBody
    public String addUser(){
        ModelAndView obj =new ModelAndView();
        obj.setViewName("login.html");
        return "LOGIN";
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

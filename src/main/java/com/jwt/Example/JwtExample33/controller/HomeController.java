package com.jwt.Example.JwtExample33.controller;

import com.jwt.Example.JwtExample33.model.User;
import com.jwt.Example.JwtExample33.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Home")
public class HomeController {

    @Autowired
    UserService userService;


    @GetMapping("/user")
    public List<User> getUser()
    {
        System.out.print("Getting Users");
       return  userService.getUser();
    }
}

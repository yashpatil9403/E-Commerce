package com.data.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.DTO.UserLoginDto;
import com.data.DTO.UserRegistrationDto;
import com.data.Service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;

    // Register a new user
    @PostMapping("/register")
    public String registerUser(@RequestBody UserRegistrationDto registrationDto) {
        return userService.registerUser(registrationDto);
    }

    // User login
    @PostMapping("/login")
    public String loginUser(@RequestBody UserLoginDto loginDto) {
        return userService.loginUser(loginDto);
    }
}

package com.core.controller;
import com.core.service.UserService;

public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void createUser(String name) {
        userService.registerUser(name);
    }
}
package com.my.controller;


import com.my.pojo.User;
import com.my.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    boolean selectUsers(User user) {
        System.out.println(user);
        return userService.selectUser(user);
    }


    @PostMapping
    boolean addUser(@RequestBody User user) {
        if (user.getUsername() != null && user.getUsername() != "" && user.getPassword() != null && user.getPassword() != "") {
            if (userService.selectByUser(user)) {
                return userService.add(user);
            }
            return false;
        }
        return false;
    }
}


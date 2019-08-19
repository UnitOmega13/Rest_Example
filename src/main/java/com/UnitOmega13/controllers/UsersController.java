package com.UnitOmega13.controllers;

import com.UnitOmega13.entity.User;
import com.UnitOmega13.service.UserService;
import com.UnitOmega13.utils.HashingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/users")
public class UsersController {
    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = {"/all"})
    public List<User> showAllUsers() {
      return userService.getAll();
    }

    @PostMapping(path = {"/newUser"})
    public User hashPassword(@RequestBody User user) {
        user.setPassword(HashingUtil.hashPassword(user.getPassword()));
        userService.add(user);
        return user;
    }
}

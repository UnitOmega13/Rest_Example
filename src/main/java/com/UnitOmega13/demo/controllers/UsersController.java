package com.UnitOmega13.demo.controllers;

import com.UnitOmega13.demo.entity.User;
import com.UnitOmega13.demo.service.UserService;
import com.UnitOmega13.demo.utils.HashingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

package com.UnitOmega13.controllers;

import com.UnitOmega13.entity.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class UsersController {
    @GetMapping(path = {"/getUser"})
    public User getUsers() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/newUser";
        HttpEntity<User> request =
                new HttpEntity<>(new User("user@user", "123456", "user"));
        ResponseEntity<User> user = restTemplate.postForEntity(url, request, User.class);
        return user.getBody();
    }
}

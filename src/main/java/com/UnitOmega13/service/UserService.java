package com.UnitOmega13.service;

import com.UnitOmega13.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void add(User user);
    List<User> getAll();
}

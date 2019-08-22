package com.UnitOmega13.service.Impl;

import com.UnitOmega13.entity.User;
import com.UnitOmega13.repository.UserRepository;
import com.UnitOmega13.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceInpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceInpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Transactional
    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}

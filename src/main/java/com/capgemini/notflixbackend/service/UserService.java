package com.capgemini.notflixbackend.service;

import com.capgemini.notflixbackend.model.User;

public interface UserService {
    User findByUsername(String username , String password);
    Iterable<User> findAll();
    User saveUser(User user);
}

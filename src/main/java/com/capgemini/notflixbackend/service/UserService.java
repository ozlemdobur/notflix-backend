package com.capgemini.notflixbackend.service;

import com.capgemini.notflixbackend.model.User;

public interface UserService {
    User findByUsername(String username , String password);
    User saveUser(User user);
}

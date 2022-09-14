package com.capgemini.notflixbackend.service;

import com.capgemini.notflixbackend.model.User;
import com.capgemini.notflixbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByUsername(String username, String password) {

        User user = userRepository.findByUsernameAndPassword(username, password);

        return user;

    }

    @Override
    public Iterable<User> findAll() {

        Iterable<User> user = userRepository.findAll();

        return user;

    }

    @Override
    public User saveUser(User user) {
        User newUser =  userRepository.save(user);
        return newUser;
    }

}

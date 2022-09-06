package com.capgemini.notflixbackend.controller;

import com.capgemini.notflixbackend.model.User;
import com.capgemini.notflixbackend.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="api")
public class UserController {

    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/login")
    public ResponseEntity<User> login(String username, String password){
        User user = userRepository.findByUsernameAndPassword(username, password);

        return ResponseEntity.ok(user);

    }

}

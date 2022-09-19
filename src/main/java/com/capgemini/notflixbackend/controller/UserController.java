package com.capgemini.notflixbackend.controller;

import com.capgemini.notflixbackend.model.User;
import com.capgemini.notflixbackend.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="api")
public class UserController {

    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @CrossOrigin
    @PostMapping(value = "/login")
    public ResponseEntity<User> login(String username, String password){
        User user = userRepository.findByUsernameAndPassword(username, password);

        return ResponseEntity.ok(user);

    }
    @CrossOrigin
    @GetMapping(value = "/login")
    public ResponseEntity<Iterable<User>> login(){

        Iterable<User> user =  userRepository.findAll();
        return ResponseEntity.ok(user);

    }

}

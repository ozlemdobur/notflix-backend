package com.capgemini.notflixbackend.repository;

import com.capgemini.notflixbackend.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}

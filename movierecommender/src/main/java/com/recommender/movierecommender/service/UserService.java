package com.recommender.movierecommender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recommender.movierecommender.dao.UserRepository;
import com.recommender.movierecommender.model.Users;
 
@Service
public class UserService {
 
    @Autowired
    private UserRepository userRepository;

    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

    public boolean findByUsername(String username, String password) {
        Users existingUser= userRepository.findByUsername(username);
        if(username.equals(existingUser.getUsername()))
        	return true;
        
    	return false;
    }
 
}

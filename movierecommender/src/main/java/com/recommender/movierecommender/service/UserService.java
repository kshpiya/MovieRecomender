
package com.recommender.movierecommender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recommender.movierecommender.dao.UserRepository;
import com.recommender.movierecommender.model.User;
 
@Service
public class UserService {
 
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
 
}

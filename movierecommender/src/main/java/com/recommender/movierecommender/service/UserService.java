package com.recommender.movierecommender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;

import com.recommender.movierecommender.config.MyUserDetails;
import com.recommender.movierecommender.dao.UserDao;
import com.recommender.movierecommender.model.User;
 
public class UserService implements UserDetailsService  {
 
    @Autowired
    private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findByUsername(username);
        
        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
        return new MyUserDetails(user);
	}
 
}

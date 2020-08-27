package com.stockApp.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stockApp.user.dao.UserDao;
import com.stockApp.user.model.User;
import com.stockApp.user.shared.Authentication;
import com.stockApp.user.shared.Credentials;

@Service
public class UserServiceImpl implements UserService{

	UserDao userDao;
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Transactional
	public void saveUser(User user) {
		userDao.save(user);
	}

	@Override
	public Authentication verify(Credentials credentials) {
		Authentication authentication = new Authentication();
        User user = userDao.findByUsername(credentials.getUserName());
        if(user.getPassword().equals(credentials.getPassword()))
            authentication.verified=true;
        else
            authentication.verified=false;
        return authentication;
	}
	

}

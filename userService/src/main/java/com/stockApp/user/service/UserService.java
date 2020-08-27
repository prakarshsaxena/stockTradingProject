package com.stockApp.user.service;

import com.stockApp.user.model.User;
import com.stockApp.user.shared.Authentication;
import com.stockApp.user.shared.Credentials;

public interface UserService {
	public void saveUser(User user);
    public Authentication verify(Credentials credentials);
}

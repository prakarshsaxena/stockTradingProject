package com.stockApp.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockApp.user.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	public User findByUsername(String name);
}

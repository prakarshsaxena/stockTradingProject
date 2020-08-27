package com.stockApp.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.stockApp.user.dao.UserDao;
import com.stockApp.user.model.User;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceApplication implements CommandLineRunner {


	UserDao userDao;
	
	public UserServiceApplication(UserDao userDao) {
		this.userDao = userDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userDao.save(new User(1,"ps","xyz", "Admin", "ps@gmail.com", 987654321, "yes"));
	}

}

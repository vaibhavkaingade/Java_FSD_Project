package com.vehicle.services;

import java.util.List;

import com.vehicle.entity.User;


public interface UserService {
	List<User> getAllUsers();
	void saveUser(User services);
	User getUserById(long id);
	void deleteUserById(long id);
}
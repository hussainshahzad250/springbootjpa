package com.therealdanvega.service;

import java.util.List;

import com.therealdanvega.model.User;


public interface UserService {

	List<User> getUsers();

	boolean saveUser(User user);

	User getUserByEmail(String email);

	boolean deleteUserById(Long id);


}

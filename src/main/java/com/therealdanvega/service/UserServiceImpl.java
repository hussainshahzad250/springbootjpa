package com.therealdanvega.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.therealdanvega.model.User;
import com.therealdanvega.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	private UserRepository userRepository;
	
	

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getUsers() {
	
		return (List<User>) userRepository.findAll();
	}

	@Override
	public boolean saveUser(User user) {
		try {
			userRepository.save(user);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public User getUserByEmail(String email) {
		
		return null;
	}

	@Override
	public boolean deleteUserById(Long id) {
		
		try {
			userRepository.delete(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	

	
}

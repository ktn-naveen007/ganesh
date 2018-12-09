package com.jaiganesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaiganesh.DummyException;
import com.jaiganesh.entities.Users;
import com.jaiganesh.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository urepo;

	public boolean login(String username, String password) {
		Users users = urepo.findByUsernameAndPassword(username, password);

		if (users != null) {
			return true;
		}
		throw new DummyException("Wrong username or password!!!");
	}
}

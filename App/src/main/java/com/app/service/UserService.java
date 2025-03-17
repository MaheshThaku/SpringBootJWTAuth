package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.entity.UserEntity;
import com.app.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	public UserEntity add(UserEntity entity)
	{
		entity.setPassword(encoder.encode(entity.getPassword()));
		return repo.save(entity);
	}
	
	public UserEntity get(int id)
	{
		UserEntity g = repo.findById(id).orElseThrow();
		return g;
	}
	
	public List<UserEntity> getAll()
	{
		return repo.findAll();
	}
}

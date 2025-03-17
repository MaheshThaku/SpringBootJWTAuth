package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.UserEntity;
import com.app.service.UserService;

@RestController
@RequestMapping("/employer")
public class EmployerController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/get/{id}")
//	@PreAuthorize("hasAuthority('ROLE_USER')")
	public UserEntity get(@PathVariable int id)
	{
		return service.get(id);
	}
	
	@GetMapping("/getAll")
//	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<UserEntity> getAll()
	{
		return service.getAll();
	}
}

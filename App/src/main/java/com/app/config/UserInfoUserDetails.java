package com.app.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.app.entity.UserEntity;
import com.app.repo.UserRepo;

@Component
public class UserInfoUserDetails implements UserDetailsService {

	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 Optional<UserEntity> userInfo = repo.findByEmail(username);
		return userInfo.map(UserInfo::new).orElseThrow();
	}

}

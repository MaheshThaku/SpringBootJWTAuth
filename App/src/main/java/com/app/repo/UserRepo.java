package com.app.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer>{
	Optional<UserEntity> findByEmail(String email);
}

package com.app.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.OtpVerification;

public interface OtpRepo extends CrudRepository<OtpVerification, Long> {
	Optional<OtpVerification> findByEmail(String email);
    void deleteByEmail(String email);
}

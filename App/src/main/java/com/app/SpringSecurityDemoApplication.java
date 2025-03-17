package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.app.entity.UserEntity;
import com.app.repo.UserRepo;

@SpringBootApplication
@EnableAsync
public class SpringSecurityDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDemoApplication.class, args);
	}

	@Autowired
	UserRepo repo;

	@Autowired
	PasswordEncoder encoder;
	
	@Override
	public void run(String... args) throws Exception {
		UserEntity user = UserEntity.builder().email("salico8115@excederm.com").password(encoder.encode("123456")).roles("ADMIN")
				.build();
		repo.save(user);

		System.out.println(user);
	}

}

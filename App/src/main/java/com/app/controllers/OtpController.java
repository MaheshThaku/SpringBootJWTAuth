package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.OtpService;

@RestController
@RequestMapping("/otp")
public class OtpController {
	
	@Autowired
	private OtpService otpService;
	
	@PostMapping("/forgot-password")
	public ResponseEntity<String> forgotPassword(@RequestParam String email) {
		otpService.generateAndSendOtp(email);
		return ResponseEntity.ok("OTP sent to email");
	}

	@PostMapping("/reset-password")
	public ResponseEntity<String> resetPassword(@RequestParam String email, @RequestParam String otp,
			@RequestParam String newPassword) {
		otpService.verifyOtpAndResetPassword(email, otp, newPassword);
		return ResponseEntity.ok("Password successfully reset");
	}

}

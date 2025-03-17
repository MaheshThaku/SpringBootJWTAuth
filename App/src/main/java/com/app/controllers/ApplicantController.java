package com.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobApplicant")
public class ApplicantController {
	
	@GetMapping("/getApplicant")
	public String abc() {
		return "this is endpoint that is accessed by JobApplicant only";
	}
}

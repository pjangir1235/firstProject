package com.example.firstProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

	@GetMapping("/")
	public String health() {
		return "Working Fine VInod";
	}
}

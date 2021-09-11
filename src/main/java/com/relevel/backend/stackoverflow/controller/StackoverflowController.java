package com.relevel.backend.stackoverflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StackoverflowController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}


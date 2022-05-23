package com.kodehive.javawithapi9.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MahasiswaController {

	@RequestMapping("/url/test")
	public String home() {
		return "Kodehive Academy";
	}
	
}

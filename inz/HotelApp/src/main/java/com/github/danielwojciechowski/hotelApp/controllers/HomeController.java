package com.github.danielwojciechowski.hotelApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/hotelApp")
	public String home() {
		System.out.println();
		return "index";
	}
}

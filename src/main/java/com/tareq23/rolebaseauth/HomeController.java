package com.tareq23.rolebaseauth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping()
	public String Home()
	{
		return "Home Page";
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return "<h1> Welcome admin </h1>";
	}
	
	@GetMapping("/user")
	public String user()
	{
		return "<h1> Welcome user </h1>";
	}
	
}

package com.cognizant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

	@GetMapping("/{number}")
	public Account getAccount(@PathVariable("number") String number)
	{
		return new Account(number,"savings",234343);
		
	}
	
	
}

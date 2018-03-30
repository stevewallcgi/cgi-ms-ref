package com.cgi.msref.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@Autowired
	private Account account;
	
	@RequestMapping("/message")
	public String message() {
		return account.getMessage();
	}
	
}

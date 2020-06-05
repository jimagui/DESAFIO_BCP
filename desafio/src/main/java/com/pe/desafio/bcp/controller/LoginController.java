package com.pe.desafio.bcp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pe.desafio.bcp.segurity.AccessToken;
import com.pe.desafio.bcp.util.TokenUtil;

@RestController
public class LoginController {

	@PostMapping("login")
	public AccessToken login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
		
		String token = TokenUtil.getJWTToken(username);
		AccessToken user = new AccessToken();
		user.setUserName(username);
		user.setToken(token);		
		return user;
		
	}
	
	
}

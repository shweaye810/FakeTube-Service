package com.shwe.faketube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {
	@GetMapping()
	public String hello() {
		return "service is working";
	}
	
	@Autowired
	private OAuth2ClientContext oauth;
	
	@RequestMapping("/token")
	public String getToken() {
		OAuth2AccessToken token = oauth.getAccessToken();
		System.out.println("token: " + token.getValue());
		return token.getValue();
	}
}

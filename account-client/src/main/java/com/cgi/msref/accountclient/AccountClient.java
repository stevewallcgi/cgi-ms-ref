package com.cgi.msref.accountclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
		  name = "account", 
		  fallback = AccountClientFallback.class
		)
public interface AccountClient {
	
	@RequestMapping(method=RequestMethod.GET, value="/message")
	String getMessage();
}

class AccountClientFallback implements AccountClient {
	@Override
	public String getMessage() {
		return "In fallback";
	}
}

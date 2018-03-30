package com.cgi.msref.account;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class Account {
	  @Value("${message}")
	  String message;
	  
	  public String getMessage() {
		  return message;
	  }
}

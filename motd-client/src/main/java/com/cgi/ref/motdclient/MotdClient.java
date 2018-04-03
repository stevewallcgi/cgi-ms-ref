package com.cgi.ref.motdclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(
		  name = "motd",
          fallback = MotdClientFallback.class
		)
interface MotdClient {
    @RequestMapping("/message")
    String message();
}


package com.cgi.ref.motdclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MotdController {
    @Autowired
    private MotdClient motdClient;

    @RequestMapping(path = "/message")
    public String getMessage() {
        String message = motdClient.message();

        return message;
    }
}

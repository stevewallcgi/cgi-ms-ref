package com.cgi.ref.motdclient;

import org.springframework.stereotype.Component;

@Component
public class MotdClientFallback implements MotdClient {

    @Override
    public String message() {
        return "In fallback\n";
    }
}

package com.togisoft.backend.security.exceptions;

public class TokenNotFoundException extends RuntimeException {
    public TokenNotFoundException(String token) {
        super("Token is invalid!: " + token);
    }
}

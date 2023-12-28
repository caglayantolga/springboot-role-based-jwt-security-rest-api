package com.togisoft.backend.security.exceptions;

public class RefreshTokenNotFoundException extends RuntimeException {
    public RefreshTokenNotFoundException(String refreshToken) {
        super("Refresh token is invalid!: " + refreshToken);
    }
}

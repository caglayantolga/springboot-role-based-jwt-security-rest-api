package com.togisoft.backend.security.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RefreshTokenNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(RefreshTokenNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String refreshTokenNotFoundHandler(RefreshTokenNotFoundException ex) {
        return ex.getMessage();
    }
}

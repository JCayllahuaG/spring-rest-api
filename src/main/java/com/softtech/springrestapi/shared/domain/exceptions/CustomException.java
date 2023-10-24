package com.softtech.springrestapi.shared.domain.exceptions;

import org.springframework.http.HttpStatus;

public class CustomException extends Exception {

    private final HttpStatus httpStatus;
    public CustomException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
    }
    public  HttpStatus getHttpStatus() {
        return httpStatus;
    }
}

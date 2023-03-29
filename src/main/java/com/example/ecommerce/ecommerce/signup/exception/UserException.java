package com.example.ecommerce.ecommerce.signup.exception;

public class UserException extends Exception {
    private static final Long serialVersionUID = 1L;
    private String errorMessage;

    public UserException() {

    }

    public UserException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}


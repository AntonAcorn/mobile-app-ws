package com.acorn.mobileappws.exceptions;

public class UserServiceException extends RuntimeException{
    private static final long serialVersionUID = 8838480540518827100L;

    public UserServiceException(String message) {
        super(message);
    }
}

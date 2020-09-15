package com.thoughtworks.gtb.jdan.basicquiz.Exception;

public class UserException extends RuntimeException {
    private final String error;

    public UserException(String error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        return error;
    }
}

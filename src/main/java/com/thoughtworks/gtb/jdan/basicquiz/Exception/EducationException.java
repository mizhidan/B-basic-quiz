package com.thoughtworks.gtb.jdan.basicquiz.Exception;

public class EducationException extends Exception{
    private final String error;

    public EducationException(String error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        return error;
    }
}

package com.thoughtworks.gtb.jdan.basicquiz.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserException.class)
    public ResponseEntity<ErrorResult> handleUserIdInvalid(UserException exception) {
        ErrorResult errorResult = ErrorResult.builder()
                .timestamp(new Date())
                .status(HttpStatus.BAD_REQUEST.value())
                .error("bad request")
                .message(exception.getMessage()).build();
        return ResponseEntity.badRequest().body(errorResult);
    }
}

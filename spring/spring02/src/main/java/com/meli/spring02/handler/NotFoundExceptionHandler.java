package com.meli.spring02.handler;

import com.meli.spring02.exception.NotFoundException;
import com.meli.spring02.exception.NotFoundExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class NotFoundExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<NotFoundExceptionDetails> handlerNotFoundException(NotFoundException ex){
        return new ResponseEntity<>(
            NotFoundExceptionDetails.builder()
                .title("Object not found")
                .status(HttpStatus.NOT_FOUND.value())
                .msg(ex.getMessage())
                .timestamp(LocalDateTime.now())
                .build(),
            HttpStatus.NOT_FOUND
        );
    }
}

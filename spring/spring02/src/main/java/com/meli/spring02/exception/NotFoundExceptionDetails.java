package com.meli.spring02.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class NotFoundExceptionDetails {
    private String title;
    private int status;
    private String msg;
    private LocalDateTime timestamp;

}

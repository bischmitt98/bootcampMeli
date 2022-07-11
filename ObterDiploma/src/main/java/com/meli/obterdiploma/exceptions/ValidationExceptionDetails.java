package com.meli.obterdiploma.exceptions;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ValidationExceptionDetails {
    private String title, message, fields, fieldsMessages;
    private LocalDateTime timestamp;
}
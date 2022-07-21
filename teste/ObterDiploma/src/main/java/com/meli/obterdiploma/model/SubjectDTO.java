package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {
    @NotBlank(message = "The subject cannot be empty")
    @Pattern(regexp = "^[A-Z]+.*$", message = "The subject must start with a capital letter")
    @Size(max = 30, message = "The name's length cannot exceed 30 characters")
    String name;

    @NotNull(message = "The averageScore cannot be blank")
    @DecimalMin(value = "0.0", message = "The minimum score is zero")
    @DecimalMax(value = "10.00", message = "The maximum score is 10")
    Double score;
}

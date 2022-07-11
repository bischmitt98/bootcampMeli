package com.meli.obterdiploma.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Data
@Getter @Setter
public class StudentDTO {
    @Pattern(regexp = "^[A-Z]+.*$", message = "The student's name must start with a capital letter")
    @NotBlank(message = "The student's name field is obligatory")
    @Size(max = 50, message = "The maximum value is 50 characters")
    String studentName;

    String message;

    Double averageScore;

    @NotEmpty(message = "The list cannot be blank")
    @Valid
    List<SubjectDTO> subjects;
}

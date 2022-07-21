package com.testing.meli.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class UserDto {
    @NotBlank(message = "The field name is obligatory")
    private String name;

    @NotBlank(message = "The field email is obligatory")
    @Email(message = "The email must be valid")
    private String email;

    @Min(value = 18, message = "The minimum age is 18")
    private int age;
}

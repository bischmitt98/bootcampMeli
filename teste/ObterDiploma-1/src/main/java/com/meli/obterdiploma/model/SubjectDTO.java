package com.meli.obterdiploma.model;

import lombok.*;

import javax.validation.constraints.*;
import java.io.Serializable;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SubjectDTO implements Serializable {
    @NotBlank(message = "O nome do assunto não pode ficar vazio.")
    @Pattern(regexp="([A-Z]|[0-9])[\\s|[0-9]|A-Z|a-z|ñ|ó|í|á|é|ú|Á|Ó|É|Í|Ú]*$", message = "O nome do assunto deve começar com letra maiúscula.")
    @Size(max = 30, message = "O comprimento do nome do assunto não pode exceder 30 caracteres.")
    String name;

    @NotNull(message = "A nota de assunto não pode ficar vazia.")
    @DecimalMax(value = "10.0", message = "A nota máxima da disciplina é de 10 pontos.")
    @DecimalMin(value = "0.0", message = "A nota mínima para a disciplina é de 0 pontos.")
    Double score;
}

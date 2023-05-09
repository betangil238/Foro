package com.alura.foro.curso;

import jakarta.validation.constraints.NotBlank;

public record DatosCurso(@NotBlank String nombrecurso,@NotBlank String categoria) {

}

package com.alura.foro.usuario;

import jakarta.validation.constraints.NotBlank;

public record DatosUsuario(@NotBlank String nombre,@NotBlank String email) {

}

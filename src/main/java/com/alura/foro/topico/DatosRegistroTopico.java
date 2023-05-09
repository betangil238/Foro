package com.alura.foro.topico;
import com.alura.foro.curso.DatosCurso;
import com.alura.foro.usuario.DatosUsuario;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(@NotBlank String titulo,@NotBlank String mensaje,@NotNull @Valid DatosUsuario autor,@NotNull @Valid DatosCurso curso) {

}

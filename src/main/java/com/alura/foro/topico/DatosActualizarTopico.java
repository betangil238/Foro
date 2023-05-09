package com.alura.foro.topico;

import com.alura.foro.curso.DatosCurso;
import com.alura.foro.usuario.DatosUsuario;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id,String titulo, String mensaje,@Valid DatosUsuario autor,@Valid DatosCurso curso) {

}

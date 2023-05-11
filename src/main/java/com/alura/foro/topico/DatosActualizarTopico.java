package com.alura.foro.topico;

import com.alura.foro.autor.DatosAutor;
import com.alura.foro.curso.DatosCurso;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id,String titulo, String mensaje,@Valid DatosAutor autor,@Valid DatosCurso curso) {

}

package com.alura.foro.topico;
import com.alura.foro.autor.DatosAutor;
import com.alura.foro.curso.DatosCurso;

import jakarta.validation.Valid;

public record DatosActualizarTopicoID(String titulo, String mensaje,@Valid DatosAutor autor,@Valid DatosCurso curso) {

}

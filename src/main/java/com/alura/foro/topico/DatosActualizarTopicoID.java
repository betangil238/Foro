package com.alura.foro.topico;
import com.alura.foro.curso.DatosCurso;
import com.alura.foro.usuario.DatosUsuario;

import jakarta.validation.Valid;

public record DatosActualizarTopicoID(String titulo, String mensaje,@Valid DatosUsuario autor,@Valid DatosCurso curso) {

}

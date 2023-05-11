package com.alura.foro.topico;

import java.time.LocalDateTime;

import com.alura.foro.autor.DatosAutor;
import com.alura.foro.curso.DatosCurso;

public record DatosRespuestaTopico (Long id,String titulo, String mensaje,LocalDateTime fechaCreacion,String status,DatosAutor autor,DatosCurso curso ) {

}

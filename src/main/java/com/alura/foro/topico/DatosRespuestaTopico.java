package com.alura.foro.topico;

import java.time.LocalDateTime;

import com.alura.foro.curso.DatosCurso;
import com.alura.foro.usuario.DatosUsuario;

public record DatosRespuestaTopico (Long id,String titulo, String mensaje,LocalDateTime fechaCreacion,String status,DatosUsuario autor,DatosCurso curso ) {

}

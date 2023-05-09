package com.alura.foro.topico;

import java.time.LocalDateTime;

import com.alura.foro.curso.Curso;
import com.alura.foro.usuario.Usuario;

public record DatosListadoTopico(Long id,String titulo,String mensaje,LocalDateTime fechaCreacion, StatusTopico status,Usuario autor, Curso curso) {

	public DatosListadoTopico(Topico topico) {
		this(topico.getId(), topico.getTitulo(),topico.getMensaje(),topico.getfechaCreacion(),topico.getStatus(),topico.getAutor(),topico.getCurso());
	}

}

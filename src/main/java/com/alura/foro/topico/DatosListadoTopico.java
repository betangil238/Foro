package com.alura.foro.topico;

import java.time.LocalDateTime;

import com.alura.foro.autor.Autor;
import com.alura.foro.curso.Curso;

public record DatosListadoTopico(Long id,String titulo,String mensaje,LocalDateTime fechaCreacion, StatusTopico status,Autor autor, Curso curso) {

	public DatosListadoTopico(Topico topico) {
		this(topico.getId(), topico.getTitulo(),topico.getMensaje(),topico.getfechaCreacion(),topico.getStatus(),topico.getAutor(),topico.getCurso());
	}

}

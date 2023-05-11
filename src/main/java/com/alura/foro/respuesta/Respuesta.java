package com.alura.foro.respuesta;

import java.time.LocalDateTime;

import com.alura.foro.autor.Autor;
import com.alura.foro.topico.Topico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public @Data class Respuesta {

	private Long idrespuesta;
	private String mensaje;
	private Topico topico;
	private LocalDateTime fechaCreacion = LocalDateTime.now();
	private Autor autor;
	private Boolean solucion = false;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idrespuesta == null) ? 0 : idrespuesta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Respuesta other = (Respuesta) obj;
		if (idrespuesta == null) {
			if (other.idrespuesta != null)
				return false;
		} else if (!idrespuesta.equals(other.idrespuesta))
			return false;
		return true;
	}

	public Long getId() {
		return idrespuesta;
	}

	public void setId(Long id) {
		this.idrespuesta = id;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Topico getTopico() {
		return topico;
	}

	public void setTopico(Topico topico) {
		this.topico = topico;
	}

	public LocalDateTime getfechaCreacion() {
		return fechaCreacion;
	}

	public void setfechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Boolean getSolucion() {
		return solucion;
	}

	public void setSolucion(Boolean solucion) {
		this.solucion = solucion;
	}

}

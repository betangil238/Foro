package com.alura.foro.topico;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.alura.foro.autor.Autor;
import com.alura.foro.curso.Curso;
import com.alura.foro.respuesta.Respuesta;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="topicos")
@Entity(name="Topico")
@NoArgsConstructor
@AllArgsConstructor
public @Data class Topico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String mensaje;
	private LocalDateTime fechaCreacion = LocalDateTime.now();
	@Enumerated(EnumType.STRING)
	private StatusTopico status = StatusTopico.NO_RESPONDIDO;
	@Embedded
	private Autor autor;
	@Embedded
	private Curso curso;
	@Embedded
	private List<Respuesta> respuestas = new ArrayList<>();

	public Topico(String titulo, String mensaje, Curso curso) {
		this.titulo = titulo;
		this.mensaje = mensaje;
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Topico other = (Topico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public LocalDateTime getfechaCreacion() {
		return fechaCreacion;
	}

	public void setfechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public StatusTopico getStatus() {
		return status;
	}

	public void setStatus(StatusTopico status) {
		this.status = status;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	public Topico(DatosRegistroTopico datos) {
		this.titulo = datos.titulo();
		this.mensaje = datos.mensaje();
		this.curso= new Curso(datos.curso());
		this.autor = new Autor(datos.autor());
	}

	public void ActualizarDatos(DatosActualizarTopico datos) {
		if (datos.titulo() !=null) {
			this.titulo = datos.titulo();
		}
		if (datos.mensaje() !=null) {
			this.mensaje = datos.mensaje();
		}
		if(datos.curso() !=null) {
			this.curso= curso.ActualizarDatos(datos.curso());
		}
		if(datos.autor() !=null) {
			this.autor = autor.ActualizarDatos(datos.autor());
		}
	}

	public void ActualizarDatosID(DatosActualizarTopicoID datos) {
		if (datos.titulo() !=null) {
			this.titulo = datos.titulo();
		}
		if (datos.mensaje() !=null) {
			this.mensaje = datos.mensaje();
		}
		if(datos.curso() !=null) {
			this.curso= curso.ActualizarDatos(datos.curso());
		}
		if(datos.autor() !=null) {
			this.autor = autor.ActualizarDatos(datos.autor());
		}	
	}

}

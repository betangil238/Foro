package com.alura.foro.curso;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public @Data class Curso {

//	private Long idcurso;
	private String nombrecurso;
	private String categoria;

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((idcurso == null) ? 0 : idcurso.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Curso other = (Curso) obj;
//		if (idcurso == null) {
//			if (other.idcurso != null)
//				return false;
//		} else if (!idcurso.equals(other.idcurso))
//			return false;
//		return true;
//	}

//	public Long getId() {
//		return idcurso;
//	}
//
//	public void setId(Long id) {
//		this.idcurso = id;
//	}

//	public String getNombre() {
//		return nombrecurso;
//	}
//
//	public void setNombre(String nombrecurso) {
//		this.nombrecurso = nombrecurso;
//	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Curso(DatosCurso curso) {
		this.nombrecurso = curso.nombrecurso();
		this.categoria = curso.categoria();
	}

	public Curso ActualizarDatos(DatosCurso curso) {
			this.nombrecurso = curso.nombrecurso();
			this.categoria = curso.categoria();	
		return this;
	}

}

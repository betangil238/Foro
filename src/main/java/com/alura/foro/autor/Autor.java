package com.alura.foro.autor;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public @Data class Autor {

//	private Long idautor;
	private String nombre;
	private String email;
	private String contrasena;

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((idautor == null) ? 0 : idautor.hashCode());
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
//		Autor other = (Autor) obj;
//		if (idautor == null) {
//			if (other.idautor != null)
//				return false;
//		} else if (!idautor.equals(other.idautor))
//			return false;
//		return true;
//	}
//
//	public Long getId() {
//		return idautor;
//	}
//
//	public void setId(Long id) {
//		this.idautor = id;
//	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Autor(DatosAutor autor) {
		this. nombre=autor.nombre();
		this.email=autor.email();
	}
	
	public Autor(Autor autor) {
		this. nombre=autor.getNombre();
		this.email=autor.getEmail();
	}

	public Autor ActualizarDatos(DatosAutor autor) {
			this. nombre=autor.nombre();
			this.email=autor.email();
		return this;
	}

}

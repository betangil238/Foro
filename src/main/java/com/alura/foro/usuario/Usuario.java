package com.alura.foro.usuario;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public @Data class Usuario {

//	private Long idusuario;
	private String nombre;
	private String email;
	private String contrasena;

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((idusuario == null) ? 0 : idusuario.hashCode());
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
//		Usuario other = (Usuario) obj;
//		if (idusuario == null) {
//			if (other.idusuario != null)
//				return false;
//		} else if (!idusuario.equals(other.idusuario))
//			return false;
//		return true;
//	}
//
//	public Long getId() {
//		return idusuario;
//	}
//
//	public void setId(Long id) {
//		this.idusuario = id;
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

	public Usuario(DatosUsuario autor) {
		this. nombre=autor.nombre();
		this.email=autor.email();
	}
	
	public Usuario(Usuario autor) {
		this. nombre=autor.getNombre();
		this.email=autor.getEmail();
	}

	public Usuario ActualizarDatos(DatosUsuario autor) {
			this. nombre=autor.nombre();
			this.email=autor.email();
		return this;
	}

}

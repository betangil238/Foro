package com.alura.foro.controller;
import com.alura.foro.usuarios.Usuario;
import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alura.foro.usuarios.DatosAutenticacacionUsuario;
import jakarta.validation.Valid;
import com.alura.foro.infra.security.DatosJWTToken;
import com.alura.foro.infra.security.TokenService;

@RestController
@RequestMapping("/login")
public class AutenticacionController {
	
	@Autowired
	private AuthenticationManager manager;
	@Autowired
	private TokenService tokenservice;
	@PostMapping
	public ResponseEntity AutenticarUsuario(@RequestBody @Valid DatosAutenticacacionUsuario datos){
		Authentication Autentoken= new UsernamePasswordAuthenticationToken(datos.usuario(), datos.clave());
		var autenticacion = manager.authenticate(Autentoken);
		var JWTtoken=tokenservice.GenerarToken((Usuario)autenticacion.getPrincipal());
		return ResponseEntity.ok(new DatosJWTToken(JWTtoken));	
	}

}

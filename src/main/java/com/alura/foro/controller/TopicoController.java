package com.alura.foro.controller;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.alura.foro.autor.DatosAutor;
import com.alura.foro.curso.DatosCurso;
import com.alura.foro.topico.DatosActualizarTopico;
import com.alura.foro.topico.DatosActualizarTopicoID;
import com.alura.foro.topico.DatosListadoTopico;
import com.alura.foro.topico.DatosRegistroTopico;
import com.alura.foro.topico.DatosRespuestaTopico;
import com.alura.foro.topico.Topico;
import com.alura.foro.topico.TopicoRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

//*************************************** CREAR TOPICOS **********************************************************
	@Autowired
	private TopicoRepository topicorepository;
	
	@PostMapping
	public ResponseEntity<DatosRespuestaTopico> registrarTopico(@RequestBody @Valid DatosRegistroTopico datos,UriComponentsBuilder uricomponent) {
		Topico topico=topicorepository.save(new Topico(datos));
		DatosRespuestaTopico datosrespuesta= new DatosRespuestaTopico(topico.getId(), topico.getTitulo(),topico.getMensaje(),
				topico.getfechaCreacion(), topico.getStatus().toString(), new DatosAutor(topico.getAutor().getNombre(), topico.getAutor().getEmail()),
				new DatosCurso(topico.getCurso().getNombrecurso(), topico.getCurso().getCategoria()));
		URI url=uricomponent.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
		return ResponseEntity.created(url).body(datosrespuesta);
	}
	//*************************************** CONSULTAR TOPICOS **********************************************************
	@GetMapping
	public ResponseEntity<Page<DatosListadoTopico>> mostrartopicos(Pageable paginacion){
		return ResponseEntity.ok(topicorepository.findAll(paginacion).map(DatosListadoTopico::new));
	}
	
//	@GetMapping("/{id}")
//	public Optional<Topico> mostrartopicoId(@PathVariable Long id){
//		return topicorepository.findById(id);
//	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DatosRespuestaTopico> mostrartopicoId(@PathVariable Long id){
		Topico topico= topicorepository.getReferenceById(id);
		var datosTopico= new DatosRespuestaTopico(topico.getId(), topico.getTitulo(),topico.getMensaje(),
				topico.getfechaCreacion(), topico.getStatus().toString(), new DatosAutor(topico.getAutor().getNombre(), topico.getAutor().getEmail()),
				new DatosCurso(topico.getCurso().getNombrecurso(), topico.getCurso().getCategoria()));
		return ResponseEntity.ok(datosTopico);
	}
	//*************************************** ACTUALIZAR TOPICOS **********************************************************
	@PutMapping
	@Transactional
	public ResponseEntity<DatosRespuestaTopico> actualizarTopico(@RequestBody @Valid DatosActualizarTopico datos) {
		Topico topico= topicorepository.getReferenceById(datos.id());
		topico.ActualizarDatos(datos);
		return ResponseEntity.ok(new DatosRespuestaTopico(topico.getId(), topico.getTitulo(),topico.getMensaje(),
				topico.getfechaCreacion(), topico.getStatus().toString(), new DatosAutor(topico.getAutor().getNombre(), topico.getAutor().getEmail()),
				new DatosCurso(topico.getCurso().getNombrecurso(), topico.getCurso().getCategoria())));
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<DatosRespuestaTopico> actualizarTopicoId(@PathVariable Long id,@RequestBody @Valid DatosActualizarTopicoID datos) {
		Topico topico= topicorepository.getReferenceById(id);
		topico.ActualizarDatosID(datos);
		return ResponseEntity.ok(new DatosRespuestaTopico(topico.getId(), topico.getTitulo(),topico.getMensaje(),
				topico.getfechaCreacion(), topico.getStatus().toString(), new DatosAutor(topico.getAutor().getNombre(), topico.getAutor().getEmail()),
				new DatosCurso(topico.getCurso().getNombrecurso(), topico.getCurso().getCategoria())));
	}
	//*************************************** ELIMINAR TOPICOS **********************************************************	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity EliminarMedico(@PathVariable Long id) {
		Topico topico= topicorepository.getReferenceById(id);
		topicorepository.delete(topico);
		return ResponseEntity.noContent().build();
	}


	

	


}

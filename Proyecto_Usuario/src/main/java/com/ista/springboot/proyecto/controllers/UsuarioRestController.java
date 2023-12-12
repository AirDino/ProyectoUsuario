package com.ista.springboot.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.springboot.proyecto.models.entity.Usuario;
import com.ista.springboot.proyecto.models.services.IUsuarioService;



@RestController
@RequestMapping("/api")
public class UsuarioRestController {

	@Autowired
	private IUsuarioService UServi;
		
	/*LISTAR*/
	@GetMapping ("/Usuario")
	public List<Usuario> index(){
		return UServi.findAll();
	}
	
	
	/*BUSCAR ID*/
	@GetMapping ("/Usuario/{id}")
	public Usuario show(@PathVariable Long id) {
		return UServi.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/Usuario")
	@ResponseStatus (HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario ClassU ) {
		return UServi.save(ClassU);
	}
			
	
	/*ELIMINAR*/
	@DeleteMapping ("/Usuario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		UServi.delete(id);
	}
	
	/*EDITAR*/
	@PutMapping ("/Usuario/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario ClassU,@PathVariable Long id) {
		Usuario claseU  = UServi.findById(id);
		claseU.setClave(ClassU.getClave());
		claseU.setNombre(ClassU.getNombre());
		claseU.setEmail(ClassU.getEmail());
		claseU.setEstado(ClassU.getEstado());
		
		return UServi.save(ClassU);	
	}
}

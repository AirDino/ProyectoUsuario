package com.ista.springboot.proyecto.models.services;

import java.util.List;

import com.ista.springboot.proyecto.models.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();
	
	public Usuario save(Usuario ex);
	
	public Usuario findById(long id);
	
	public void delete (long id);
}

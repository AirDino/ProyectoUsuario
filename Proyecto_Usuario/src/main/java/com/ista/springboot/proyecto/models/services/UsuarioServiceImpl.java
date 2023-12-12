package com.ista.springboot.proyecto.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.proyecto.models.dao.IUsuarioDao;
import com.ista.springboot.proyecto.models.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{	

	    @Autowired
		private IUsuarioDao UsuarioDao; 
		
		@Override
		@Transactional (readOnly = true)
		public List<Usuario> findAll() {
			return (List<Usuario>) UsuarioDao.findAll();}

		@Override
		@Transactional
		public Usuario save(Usuario Aa) {
			return UsuarioDao.save(Aa);}

		@Override
		@Transactional (readOnly = true)
		public Usuario findById(long id) {
			return UsuarioDao.findById(id).orElse(null);}

		@Override
		@Transactional
		public void delete(long id) {
			UsuarioDao.deleteById(id);}
	}



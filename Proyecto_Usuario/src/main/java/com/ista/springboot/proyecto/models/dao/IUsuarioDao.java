package com.ista.springboot.proyecto.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.proyecto.models.entity.Usuario;


public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}

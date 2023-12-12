package com.ista.springboot.proyecto.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Usuario", uniqueConstraints = {@jakarta.persistence.UniqueConstraint(columnNames = {"clave"})})
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	
	private Long id_Ciudad;
	private String Clave;
	private String Nombre;
	private String Email;
	private String Estado;
	public Long getId_Ciudad() {
		return id_Ciudad;
	}
	public void setId_Ciudad(Long id_Ciudad) {
		this.id_Ciudad = id_Ciudad;
	}
	public String getClave() {
		return Clave;
	}
	public void setClave(String clave) {
		Clave = clave;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	

	
}

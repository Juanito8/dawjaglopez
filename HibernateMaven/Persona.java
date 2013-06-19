package org.proyectosMaven.pruebasHibernate;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Persona {
	private Long id;
	private int dni;
	private String nombre;
	private String apellidos;
	
	public Persona(int dni, String nombre, String apellidos) {
		setDni(dni);
		setNombre(nombre);
		setApellidos(apellidos);
	}

	@Basic
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Basic
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Basic
	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Persona(){
		
	}
}

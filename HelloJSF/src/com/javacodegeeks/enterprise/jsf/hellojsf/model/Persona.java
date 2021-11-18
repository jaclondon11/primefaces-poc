package com.javacodegeeks.enterprise.jsf.hellojsf.model;

public class Persona {

	private String nombre;
	private int edad;
	
	public Persona() {
		this.edad = 12;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}

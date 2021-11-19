package com.javacodegeeks.enterprise.jsf.hellojsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.javacodegeeks.enterprise.jsf.hellojsf.model.Persona;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private Persona persona;
	private List<Persona> personasList;
	
	public HelloBean() {
		persona = new Persona();
		personasList = new ArrayList<Persona>();
	}
	
	public void guardarPersona() {
		personasList.add(persona);
		
		persona = new Persona();
	}
	
	
	public void borrarPersona(Persona persona) {
		System.out.println("borrando");
		personasList.remove(persona);
		System.out.println("borrado");
	}
	

	public List<Persona> getPersonasList() {
		return personasList;
	}

	public void setPersonasList(List<Persona> personasList) {
		this.personasList = personasList;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
}
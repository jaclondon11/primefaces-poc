package com.javacodegeeks.enterprise.jsf.hellojsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.javacodegeeks.enterprise.jsf.hellojsf.model.Persona;

@ManagedBean
@ViewScoped
public class HelloBean implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private Persona persona;
	
	public HelloBean() {
		persona = new Persona();
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
}
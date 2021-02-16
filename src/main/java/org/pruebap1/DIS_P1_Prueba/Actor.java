package org.pruebap1.DIS_P1_Prueba;

public class Actor {

	private String nombre;
	private String enlace;

	public Actor(String nombre, String enlace) {
		super();
		this.nombre = nombre;
		this.enlace = enlace;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

}

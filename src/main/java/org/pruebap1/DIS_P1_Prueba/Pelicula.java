package org.pruebap1.DIS_P1_Prueba;

import java.util.ArrayList;

public class Pelicula {

	private String titulo;
	private String sinopsis;
	private ArrayList<Actor> reparto;
	private String genero;
	private String enlace;

	public Pelicula(String titulo, String sinopsis, String genero, String enlace) {
		super();
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.reparto = new ArrayList<>();
		this.genero = genero;
		this.enlace = enlace;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public ArrayList<Actor> getReparto() {
		return reparto;
	}

	public void setReparto(ArrayList<Actor> reparto) {
		this.reparto = reparto;
	}

	public void aniadirActor(Actor actor) {
		this.reparto.add(actor);
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

}

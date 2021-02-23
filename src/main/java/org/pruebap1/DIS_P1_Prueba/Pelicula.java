package org.pruebap1.DIS_P1_Prueba;

import java.util.ArrayList;

public class Pelicula {
	
	private String id;
	private int duracion;
	private int anioEstreno;
	
	private String pais;
	private int presupuesto;
	
	private String titulo;
	private String sinopsis;
	private ArrayList<Actor> reparto;
	private String genero;
	private String enlace;

	public Pelicula(String id, int duracion, int anioEstreno, String pais, int presupuesto, String titulo, String sinopsis, String genero, String enlace) {
		super();
		this.id = id;
		this.duracion = duracion;
		this.anioEstreno = anioEstreno;
		
		this.pais = pais;
		this.presupuesto = presupuesto;
		
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.reparto = new ArrayList<>();
		this.genero = genero;
		this.enlace = enlace;
	}
	
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public int getAnioEstreno() {
		return anioEstreno;
	}


	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}
	

	public String getPais() {
		return pais;
	}



	public void setPais(String pais) {
		this.pais = pais;
	}



	public int getPresupuesto() {
		return presupuesto;
	}



	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
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

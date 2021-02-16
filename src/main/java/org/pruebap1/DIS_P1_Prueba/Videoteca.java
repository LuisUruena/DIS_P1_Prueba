package org.pruebap1.DIS_P1_Prueba;

import java.util.ArrayList;

public class Videoteca {
	
	private String nombre;
	private String ubicacion;
	private ArrayList <Pelicula> peliculas;
	private String fechaActualizacion;
	
	public Videoteca(String nombre, String ubicacion, String fechaActualizacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.peliculas = new ArrayList<>();
		this.fechaActualizacion = fechaActualizacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	public void aniadirPelicula(Pelicula pelicula)
	{
		this.peliculas.add(pelicula);
	}
	
	public String getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	
	

}

package org.pruebap1.DIS_P1_Prueba;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class GestorXML {

	public static Videoteca cargarVideoteca(String rutaFichero) {
		String nombreLeido, ubicacionLeida, fechaActualizacionLeida;
		Videoteca videoteca = null;

		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder;
			docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(rutaFichero);
			
			Node nodoNombre = doc.getElementsByTagName("nombre").item(0);
			nombreLeido = nodoNombre.getTextContent();
			System.out.println("Nombre leido:" + nombreLeido);
			
			Node nodoUbicacion = doc.getElementsByTagName("ubicacion").item(0);
			ubicacionLeida = nodoUbicacion.getTextContent();
			System.out.println("Ubicacion leida:" + ubicacionLeida);
			
			Node nodoFechaActualizacion = doc.getElementsByTagName("fechaActualizacion").item(0);
			fechaActualizacionLeida = nodoFechaActualizacion.getTextContent();
			System.out.println("Fecha de actualizacion leida:" + fechaActualizacionLeida);
			
			videoteca = new Videoteca(nombreLeido, ubicacionLeida, fechaActualizacionLeida);
			
			Node nodoPeliculas = doc.getElementsByTagName("peliculas").item(0);
			
			NodeList listaPeliculas = nodoPeliculas.getChildNodes();
			
			for(int i=0;i<listaPeliculas.getLength();i++) 
			{
				Node nodoPelicula = listaPeliculas.item(i);
				if(nodoPelicula.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element ePelicula = (Element)nodoPelicula;
					Pelicula pelicula;
					pelicula = parsearPelicula(ePelicula);
					
					videoteca.aniadirPelicula(pelicula);
					
				}
			}

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		return videoteca;

	}
	
	
	private static Pelicula parsearPelicula(Element ePelicula) {
		
		Pelicula pelicula = null;
		
		String tituloLeido,sinopsisLeida,generoLeido,enlaceLeido;
		
		String idPelicula = ePelicula.getAttribute("id");
		int duracionPelicula = Integer.parseInt(ePelicula.getAttribute("duracion"));
		int anioEstrenoPelicula = Integer.parseInt(ePelicula.getAttribute("anioEstreno"));
		
		String paisPelicula = null;
		int presupuestoPelicula = -1;
		
		if (ePelicula.hasAttribute("pais"))
		{
			paisPelicula = ePelicula.getAttribute("pais");
		}
		
		if (ePelicula.hasAttribute("presupuesto")) 
		{
			presupuestoPelicula = Integer.parseInt(ePelicula.getAttribute("presupuesto"));
		}
		
		
		Node tituloPelicula = ePelicula.getElementsByTagName("titulo").item(0);
		tituloLeido = tituloPelicula.getTextContent();
		
		Node sinopsisPelicula = ePelicula.getElementsByTagName("sinopsis").item(0);
		sinopsisLeida = sinopsisPelicula.getTextContent();
		
		Node generoPelicula = ePelicula.getElementsByTagName("genero").item(0);
		generoLeido = generoPelicula.getTextContent();
		
		Node enlacePelicula = ePelicula.getElementsByTagName("enlace").item(0);
		enlaceLeido = enlacePelicula.getTextContent();
		
		
		pelicula = new Pelicula(idPelicula, duracionPelicula, anioEstrenoPelicula, paisPelicula, presupuestoPelicula, tituloLeido, sinopsisLeida, generoLeido, enlaceLeido); 
		
		
		Node nodoReparto = ePelicula.getElementsByTagName("reparto").item(0);
		
		NodeList listaActores = nodoReparto.getChildNodes();

		
		for(int i=0;i<listaActores.getLength();i++) 
		{
			Node nodoActor = listaActores.item(i);
			if(nodoActor.getNodeType() == Node.ELEMENT_NODE) 
			{
				Element eActor = (Element)nodoActor;
				Actor actor;
				actor = parsearActor(eActor);
				
				pelicula.aniadirActor(actor);
				
			}
		}
		
		return pelicula;
	}


	private static Actor parsearActor(Element eActor) {
		Actor actor = null;
		
		String nombreLeido,enlaceLeido;
		
		Node nombreActor = eActor.getElementsByTagName("nombre").item(0);
		nombreLeido = nombreActor.getTextContent();
		
		Node enlaceActor = eActor.getElementsByTagName("enlace").item(0);
		enlaceLeido = enlaceActor.getTextContent();
		
		actor = new Actor(nombreLeido, enlaceLeido);
		
		return actor;
	}
	
}


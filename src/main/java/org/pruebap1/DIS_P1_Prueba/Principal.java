package org.pruebap1.DIS_P1_Prueba;

import java.io.IOException;

public class Principal {
	
	public static void main(String[] args) {
		Videoteca videoteca = GestorXML.cargarVideoteca("src/main/resources/videoteca.xml");
		try {
			GestorJSON.guardarJSON("src/main/resources/videoteca.json", videoteca);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}


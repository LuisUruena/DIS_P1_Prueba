package org.pruebap1.DIS_P1_Prueba;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GestorJSON {
	
	public static void guardarJSON(String ruta, Videoteca videoteca) throws IOException 
	{
		GsonBuilder gson = new GsonBuilder(); 
		gson.setPrettyPrinting();
		String json = gson.create().toJson(videoteca);
		System.out.println(json);
		BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));
	    writer.write(json);
	    writer.close();
	    
	    
	}
	
	public static Videoteca cargarJSON(String ruta) throws FileNotFoundException
	{
		Gson gson = new Gson();
		File archivoJSON = new File(ruta);
		String JSON;
		Scanner lectorFichero = new Scanner (archivoJSON);
		
		Videoteca videoteca = null;
		if(lectorFichero.hasNextLine()) 
		{
			JSON = lectorFichero.nextLine();
			Type tipo = new TypeToken<Videoteca>(){}.getType();
			videoteca = gson.fromJson(JSON, tipo);
		} 
		
		return videoteca;
	}

}

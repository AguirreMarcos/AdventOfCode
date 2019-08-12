package day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountNumbers1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_Fichero miLectura = new Leer_Fichero();
		
		miLectura.lee();
	}

}

class Leer_Fichero{
	
	public void lee() {
		
		try {
			
			File miArchivo = new File("/Users/marcosaguirreminarro/eclipse-workspace/AdventOfCode/src/day1/numbers.txt");
			
			FileReader entrada = new FileReader(miArchivo);
		
			//A partir de aquí vamos a crear un buffer(parte del ejemplo video 154-modificacion)
			
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			
			//Al añadir al ejercicio la lectura del objeto entrada se añade a la excepcion de FileReaderExcepcion
			//una IOEXcepcion, con lo que como filereaderexc hereda de IOExc lo sustituimos en el 
			//catch y capturamos ambos casos
			
			
			//Ejemplo inicial comentado
			/*int c = 0;
			
			while(c != -1) {
				
				c = entrada.read();
				
				char letra = (char)c;
				
				System.out.print(letra);
				
			}*/
			
			String linea = "";
			
			int suma = 0;
			
			while(linea != null) {
				
				linea = miBuffer.readLine();
				
				if (linea!= null) {
					
					suma+= Integer.parseInt(linea);
					
					
				}
				
				
			}
			System.out.println(suma);
			
			entrada.close();
			
		} catch (IOException e) {
			
			System.out.println("No se ha encontrado el archivo");
			e.printStackTrace();
			
		}
		
	}
	
}

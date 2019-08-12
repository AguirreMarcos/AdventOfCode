package day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CountNumbers1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_Fichero2 miLectura = new Leer_Fichero2();
		
		miLectura.lee2();
	}

}

class Leer_Fichero2{
	
	public void lee2() {
		
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
			
			Integer suma = 0;
			
			ArrayList<Integer> miMuestra = new ArrayList<>();
			
			while(linea!=null) {
				
				linea = miBuffer.readLine();
				
				if (linea!= null) {
					
					miMuestra.add(Integer.parseInt(linea));
					
					
				}
				
			}
			System.out.println(miMuestra.toString());
			
			//------------
			
			ArrayList<Integer> miArray = new ArrayList<>();
			
			boolean control = false;
			
			
			int i = 0;
			
			int j = 1;
			
			while(control==false&&i<miMuestra.size()) {
				
				
					
				suma+= miMuestra.get(i);

				
				if(!miArray.isEmpty()) {
					
//					for (Integer integer : miArray) {
//						
//						if(integer==suma) {
//							
//							control=true;
//						
//						}
//					}
					
					if(miArray.contains(suma)) {
						
						control= true;
						
					}
					
					if(control==false) {
						
						miArray.add(suma);
					}
					
					
					
				}else {
					
					miArray.add(suma);
					
				}
				
				i++;
				System.out.println(i+ " vuelta: "+j);
				if(i==miMuestra.size()&&control==false) {
					
					i=0;
					
					j++;
					
					
				}
				
				
			}
			
			
			System.out.println(miArray.toString());
			System.out.println(suma);
			entrada.close();
			
		} catch (IOException e) {
			
			System.out.println("No se ha encontrado el archivo");
			e.printStackTrace();
			
		}
		
	}
	
}

package entradSalida;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escanear� la consola en b�squeda de informaci�n ingresada. 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("introduce tu nombre por favor");
		
		String nombre = entrada.nextLine(); //captura el siguiente string ingresado por consola
		
		System.out.println("hola " + nombre);

	}

}

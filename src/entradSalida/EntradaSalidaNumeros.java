package entradSalida;

import java.util.Scanner;

public class EntradaSalidaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce el N�mero");
		
		int numero1 = entrada.nextInt();
		
		System.out.println("introduce el 2do N�mero");
		
		int numero2 = entrada.nextInt(); //permite escanear el siguiente int que se ingrese
		
		/*
		 * Para que la clase Scanner, la cual est� a la escucha desde el momento
		 * que la isntanciamos, no siga consumiendo recursos la cerramos 
		 * con la siguiente l�nea
		 * */
		entrada.close(); // para cerrar la escucha de Scanner
		
		System.out.println("el n�mero ingresado es " + (numero1+numero2));

	}

}

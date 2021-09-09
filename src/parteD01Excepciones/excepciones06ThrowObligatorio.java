package parteD01Excepciones;

import java.io.IOException;
import java.util.Scanner;

class excepciones06ThrowObligatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�Qu� desea hacer?");
		System.out.println("1  Dividir.");
		System.out.println("2 Finalizar");

		Scanner leer = new Scanner(System.in);
		/**
		 * nos obliga a colocar try-catch
		 */
		if (leer.nextInt() == 1) {
			try {
				realizarDivision();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Fin del programa");

	}

	/**
	 * Como es una excepci�n controlada estmos obligados a colocar el trycatch en donde se lllame al m�todo.
	 * Siempre hay que colocar la excepcion que puede pasar, no una gen�rica o err�nea.
	 */
	static void realizarDivision() throws IOException {

		Scanner leer = new Scanner(System.in);

		System.out.println("ingresa un n�mero");
		int nroUno = leer.nextInt();

		System.out.println("ingresa otro n�mero");
		int nroDos = leer.nextInt();

		int resultado = nroUno / nroDos;
		System.out.println("el resultado es" + resultado);

	}

}

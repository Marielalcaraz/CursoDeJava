package Scanner;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = (int) ((Math.random() * 100) + 1);
        int b;
        int cont=0;

        System.out.println("El juego consiste en averiguar un número secreto de 100 posibles.");

        do {
            System.out.print(" Escribe un número entre 1 y 100: ");
            b = sc.nextInt();

            if (a == b) {
                System.out.println("¡Has acertado!");
                break;
            } else if (a > b)
                System.out.println("El número secreto es MAYOR que " + b);
            else if (a < b)
                System.out.println("El número secreto es MENOR que " + b);

            cont = cont +1;
        }while(a != b);
        System.out.println("Acertó en el intento numero "+ cont);
    }
}

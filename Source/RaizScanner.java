package Scanner;
import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = e.nextInt();
        double res = Math.sqrt(num);
        System.out.println("La raiz cuadrada de "+num+" es = "+res);

    }
}

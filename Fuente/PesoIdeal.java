package Scanner;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        int peso =0;
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese genero: mujer/hombre");
        String g = e.nextLine();
        System.out.println("Ingrese su altura en cm");
        int num = e.nextInt();

        if (g.equals("mujer")){
             peso=num-120;
        }else{
            peso =num-110;
        }
        System.out.println("Su peso ideal es de "+peso+" kilos");

    }
}

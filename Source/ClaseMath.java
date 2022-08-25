package Ejercicio4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double num = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));

        System.out.println("Math.sin("+num+") = "+Math.sin(num));
        System.out.println("Math.asin("+num+") = "+Math.asin(num));
        System.out.println("Math.cos("+num+") = "+Math.cos(num));
        System.out.println("Math.acos("+num+") = "+Math.acos(num));
        System.out.println("Math.tan("+num+") = "+Math.tan(num));
        System.out.println("Math.atan("+num+") = "+Math.atan(num));
        System.out.println("Math.exp("+ num+") = "+Math.exp(num));
        System.out.println("Math.log("+num+") = "+Math.log(num));
        System.out.println("Math.abs("+num+ ") = " + Math.abs(num));
        System.out.println("Math.ceil("+ num+") = " +Math.ceil(num));
        System.out.println("Math.floor("+num+") = " + Math.floor(num));
        System.out.println("Math.nextDown("+ num+ ") = "+Math.nextDown(num));
        System.out.println("Math.getExponent("+num+ ") = "+ Math.getExponent(num));
        System.out.println("Math.PI = "+Math.PI);
        System.out.println("Math.E = "+Math.E);
        double num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese otro numero"));

        System.out.println("Math.atan2("+num+", "+num2+")"+ " = "+ Math.atan2(num, num2));
        System.out.println("Math.max("+num+", " +num2+")"+ " = "+Math.max(num, num2));
        System.out.println("Math.min("+num+","+ num2+")"+ " = "+ Math.min(num, num2));
    }
}

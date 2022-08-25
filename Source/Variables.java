package Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su salario estimado"));
        boolean carnet = true;

        JOptionPane.showMessageDialog(null, "Su nombre es "+ nombre + ".Su edad es "+ edad+ ".Su salario estimado es de "+ salario);
    }
}

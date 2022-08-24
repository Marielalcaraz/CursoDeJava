package Ejercicio1;

import javax.swing.*;

public class Auto {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));

        if (edad >= 18) {
            String carnet = JOptionPane.showInputDialog("Tiene carnet?");
            if ((carnet.equals("si")) || (carnet.equals("Si"))) {
                JOptionPane.showMessageDialog(null, "Puede comprar el auto");
            }else{
                    JOptionPane.showMessageDialog(null, "No puede comprar el auto");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No puede comprar el auto, por ser menor de edad");
            }
        }
    }

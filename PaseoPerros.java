package com.mycompany.paseoperros;

import javax.swing.JOptionPane;

public class PaseoPerros {

    public static void main(String[] args) {
        int horas, cantidadPerros;
        double valorTotal, descuento;
        
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas de paseo: "));
        cantidadPerros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de perros: "));
        
        JOptionPane.showMessageDialog(null, "Ingrese el tamaño de los perros: ");
        JOptionPane.showMessageDialog(null, "1. Grande.");
        JOptionPane.showMessageDialog(null, "2. Mediano.");
        JOptionPane.showMessageDialog(null, "3. Pequeño.");
        int op = Integer.parseInt(JOptionPane.showMessageDialog(null, "Opción: "));
        
        switch(op){
            case 1: 
                valorTotal = horas*1000;
            case 2:
            case 3: 
    }
}

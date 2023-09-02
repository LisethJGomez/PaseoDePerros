//A partir del # de horas de paseo y el # de perros hay que calcular el costo que debe pagar la persona. El paseo de un perro grande = 10k, un perro mediado = 5k, un perro pequeño = 3k. Si es más de un perro le dan un 10% del costo total.
package com.mycompany.examen;

import javax.swing.JOptionPane;

public class PaseoPerros {

    public static void main(String[] args) {
        int horas, grande, mediano, pequeño;
        double descuento;
        double valorTotal;
        
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas de paseo: "));
        grande = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de perros grandes: "));
        mediano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de perros medianos: "));
        pequeño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de perros pequeños: "));

        valorTotal = horas*(grande*10000 + mediano*5000 + pequeño*3000);
        if(grande + mediano + pequeño>1){
        descuento = valorTotal*0.10;
        valorTotal = descuento;
        }
        JOptionPane.showMessageDialog(null, "El valor total es: "+valorTotal);
    }
}
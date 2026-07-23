                /*          KAROL OCHOA BELTRAN
                       LENGUAJES DE PROGRAMACIÓN IV ACT 1
                         CALCULADOR DE IMC 2026-07-15                */

package com.karolochoa.karolochoa_a1_imc;

import javax.swing.JFrame;

public class KarolOchoa_A1_IMC{
        
 public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame ventana = new JFrame("Calculador de IMC");
              Interfaz pantalla = new Interfaz();
              
               ventana.add(pantalla);
               ventana.pack();
               ventana.setLocationRelativeTo(null);
               ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               ventana.setVisible(true);
            }
        });
    }
 
 public double calcularIMC(double peso, double estatura) {
     return peso / (estatura * estatura);
 }
 
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_bucles;

/** EJERCICIO 4
 * Muestra una cuenta atrás desde 20 a 1 por pantalla, usando un bucle for.
 * @author Jose-PC
 */
public class Ejercicio4_Bucles {

    

    public static void main(String[] args) {

        int contador = 20;

        for (; contador >= 0; contador--) {

            
            System.out.println(contador);

            if (contador <= 0) {
                System.out.println("Cuenta atrás completada con bucle for");

            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_bucles;

/** EJERCICIO 6
 * Muestra una cuenta atrás desde 20 a 1 por pantalla, usando un bucle do-while.
 * @author Jose-PC
 */
public class Ejercicio6_Bucles {


    public static void main(String[] args) {
        
        int contador = 20;
        
        do{
            System.out.println(contador);
            contador--;
            
          
        } while(contador >=0);
        
        if (contador <= 0) {
                System.out.println("Cuenta atrás completada con bucle do-while");
    }
    }
}

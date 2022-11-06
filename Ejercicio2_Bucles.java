/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_bucles;

/** EJERCICIO 2
 * Muestra los primeros 10 múltiplos de un número entero recogido desde el teclado, mediante un
bucle while.
 * @author Jose-PC
 */

import java.util.Scanner;
        
public class Ejercicio2_Bucles {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int i = 1;
        
        
        System.out.println("Inserta un número entero para calcular sus 10 primeros múltiplos");
        numero=entrada.nextInt();
        
     
        while(i<=10) {
            
            System.out.println(numero*i);
            i++;
            
            
        }
        
    }
    
}

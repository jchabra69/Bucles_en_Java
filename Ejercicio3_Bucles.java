/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_bucles;

/** EJERCICIO 3
 * Muestra los primeros 10 múltiplos de un número entero recogido desde el teclado, mediante un
bucle do-while.
 * @author Jose-PC
 */

import java.util.Scanner;

public class Ejercicio3_Bucles {
    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int i = 1;
        
        System.out.println("Inserta un número entero para calcular sus 10 primeros múltiplos");
        numero=entrada.nextInt();
        
        //io no se el valor de numero
       
        do{
            System.out.println(numero*i);
            i++;
            
            //Joselito, ten cuidado al comparar, es decir, al poner el límite. I significa múltiplo, asi k hay que poner i, ok, caprichi?
        } while(i <=10);
            
  }
}

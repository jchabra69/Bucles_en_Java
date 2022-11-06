
package com.politecnicomalaga.ejercicios_bucles;

/** EJERCICIO 1
 * Muestra los primeros 10 múltiplos de un número entero recogido desde el teclado, mediante un
bucle for.
 * @author Jose-PC
 */

//eficiente = ocupa menos RAM
import java.util.Scanner;

public class Ejercicio1_Bucles {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Introduzca un número entero por teclado y te diré sus diez primeros múltiples");
        numero = entrada.nextInt();

        for (int multiplo = 1; multiplo <= 10; multiplo++) {
            System.out.println("Múltiplo: " + numero * multiplo);

        }

    }
}

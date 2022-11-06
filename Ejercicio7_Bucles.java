/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_bucles;

/**
 * EJERCICIO 7 Realiza el control de acceso a una caja fuerte. Las contraseñas
 * serán combinaciones de 4 caracteres alfanuméricos. La contraseña inicial será
 * “0000”. Se debe de mostrar un menú cómo el que se muestra a continuación: 1.
 * Asignar nueva combinación 2. Abrir caja fuerte 0. Salir Se debe de ejecutar
 * el menú mientras no se pulse un 0. Si nos pulsan 1, pedimos la combinación
 * anterior y si se acierta, se solicita una nueva que pasará a ser la activa.
 * Si no se acierta se mostrará “combinación errónea”. En el caso de acertar:
 * “Introduzca nueva combinación” y después pondremos “Nueva combinación
 * almacenada” cuando nos den la nueva. En el caso de la opción 2, pedimos la
 * combinación activa y si se acierta se muestra en pantalla “Caja fuerte
 * abierta”.
 *
 * @author Jose-PC
 */
import java.util.Scanner;

public class Ejercicio7_Bucles {

    //void significa rutina, no función.
    //API = Application Programming Interface
    //Scanner es un objeto (entrada/teclado)
    //Int y String son objetos gracias al lenguaje estructurado 
    //Cuando ponga una variable y al poner punto aparezca algo, es un objeto porque tiene propiedades.
    //Lo que no tiene propiedades y es tipo básico no es un objeto, ejemplo "char". 
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //N0 SE PUEDEN PONER CARÁCTERES ESPECIALES
        String password = "0000";
        String newpassword;

        //Lo que hay dentro de los paréntesis es un objeto porque es String
        //Mensaje, objeto, parámetro, función.
        //System.out > objeto. Println > comportamiento. 
        System.out.println("Selecciona una de las siguientes opciones: ");
        //El número /n1 va siempre detrás.
        System.out.println("1 Asignar una nueva combinación\n2 Abrir caja fuerte\n0 Salir ");
        //Cuando los paréntesis están vacíos, significa que el objeto ya tiene la información.
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la primera opción, ingresa la contraseña actual: ");
                newpassword = entrada.next();

                if (newpassword.equals(password)) {
                    System.out.println("Ingresa una nueva contraseña: ");
                    entrada.nextLine();
                    password = entrada.next();

                    if (password.length() != 4) {
                        System.out.println("Está mal, metela de nuevo");
                        password = entrada.next();
                    } else {
                        System.out.println("Contraseña actualizada");
                    }

                } else {
                    System.out.println("Chiki, tas equivocao");
                }

                break;
            case 2:
                System.out.println("Has seleccionado la segunda opción");
                System.out.println("Introduzca contraseña");

                password = entrada.next();

                if (password.equals(password)) {
                    System.out.println("Contraseña correcta, caja abierta");
                }
                    else {
                            System.out.println("Contraseña incorrecta, no la abres");
                            }
                    break;
             
            case 3:
                System.out.println("Sayonara baby");
                break;

        }

    }

}

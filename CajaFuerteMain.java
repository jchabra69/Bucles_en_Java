/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_bucles;

/**
 *
 * @author jncb
 *  Primero hay que verlo desde fuera, luego desde dentro. Esto se conoce como top-down...
 * 
 */ 

import java.util.Scanner;

public class CajaFuerteMain {

    
   public static void main(String[] args) {
        CajaFuerte miCajaCaudales;
        Scanner teclado = new Scanner(System.in);
        int select;
        String password = "0000";
        String oldPassword, newPassword;

        System.out.println("1. Asignar nueva combinación\n2. Abrir caja fuerte\n0. Salir");
        select = teclado.nextInt();
        if (select == 1) {
            System.out.println("Ponga la contraseña antigua");
            oldPassword = teclado.nextLine();
            System.out.println("Ponga la contraseña nueva");
            newPassword = teclado.nextLine();
            if (miCajaCaudales.changePassword(oldPassword, newPassword)) {
                System.out.println("Contraseña actualizada");
            } else {
                System.out.println("La contraseña antigua no era correcta");
            }
        } else if (select == 2) {
            System.out.println("Introduzca contraseña: ");
            password = teclado.nextLine();
            if (miCajaCaudales.open(password)) {
                System.out.println("Contraseña correcta, caja abierta");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        }

    }
}

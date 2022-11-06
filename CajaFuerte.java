/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.ejercicios_bucles;

/**
 *
 * @author jncb
 */
//Definir clase
public class CajaFuerte {
//Definir atributos en private, qué necesita recordar. Necesita recordar la key de la caja fuerte:

    private String key;

//Constructor, aquí defino los valores iniciales que necesita mi objeto
    public CajaFuerte() {

        this.key = "0000";

    }

    //Métodos
    //Me dan la antigua, la comparo y si va bien la cambio.
//Si no tiene parámetro, los paréntesis. Cuando sea if, quiere decir boolean.
    public boolean changePassword(String oldKey, String newKey) {

        if (oldKey.equals(key)) {
            key = newKey;
            return true;
        } else {
            return false;
        }
    }

}

public boolean open(String clave) {
if (clave.equals(pin)) {
    return true;

}
}

        
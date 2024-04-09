package org.example;

import org.example.cadenaDeResponsabilidades.Manejador;
import org.example.cadenaDeResponsabilidades.ManejadorDivisible;
import org.example.cadenaDeResponsabilidades.ManejadorMayor;
import org.example.cadenaDeResponsabilidades.ManejadorMenor;

public class Main {
    public static void main(String[] args) {

        int numero = 60;
        Manejador mMayor = new ManejadorMayor(10, true);
        Manejador mMenor = new ManejadorMenor(50, true);
        Manejador mDivisible = new ManejadorDivisible(2);

        mMayor.setSigManejador(mMenor);
        mDivisible.setSigManejador(mMayor);

        System.out.println(mDivisible.manejar(numero));

    }
}
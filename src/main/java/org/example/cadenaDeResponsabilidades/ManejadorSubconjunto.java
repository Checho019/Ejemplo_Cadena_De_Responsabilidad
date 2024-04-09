package org.example.cadenaDeResponsabilidades;

import java.util.Arrays;

public class ManejadorSubconjunto extends Manejador{
    private int[] subconjunto;

    public ManejadorSubconjunto(int[] subconjunto) {
        this.subconjunto = subconjunto;
        Arrays.sort(this.subconjunto);
    }

    @Override
    public boolean manejar(int numero) {
        return Arrays.binarySearch(this.subconjunto, numero) >= 0 && (getSigManejador() == null || getSigManejador().manejar(numero));
    }

    public int[] getSubconjunto() {
        return subconjunto;
    }

    public void setSubconjunto(int[] subconjunto) {
        this.subconjunto = subconjunto;
    }
}

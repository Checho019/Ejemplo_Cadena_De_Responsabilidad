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
        if (Arrays.binarySearch(this.subconjunto, numero) >= 0){
            return true;
        }
        return false;
    }

    public int[] getSubconjunto() {
        return subconjunto;
    }

    public void setSubconjunto(int[] subconjunto) {
        this.subconjunto = subconjunto;
    }
}

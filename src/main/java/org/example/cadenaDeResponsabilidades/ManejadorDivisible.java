package org.example.cadenaDeResponsabilidades;

public class ManejadorDivisible extends Manejador{
    private int divisor;
    public ManejadorDivisible(int divisor){
        this.divisor = divisor;
    }

    @Override
    public boolean manejar(int numero) {
        if (numero % divisor == 0){
            if (getSigManejador() == null){
                return true;
            }
            return getSigManejador().manejar(numero);
        }
        return false;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }
}

package org.example.cadenaDeResponsabilidades;

public class ManejadorMenor extends Manejador{
    private int limiteMayor;
    private boolean esIgual;

    public ManejadorMenor(int limiteMayor, boolean esIgual) {
        this.limiteMayor = limiteMayor;
        this.esIgual = esIgual;
    }

    @Override
    public boolean manejar(int numero) {
        if (this.esIgual && numero <= limiteMayor) {
            return getSigManejador() == null || getSigManejador().manejar(numero);
        }
        if (numero < limiteMayor){
            return getSigManejador() == null || getSigManejador().manejar(numero);
        }
        return false;
    }

    public int getLimiteMayor() {
        return limiteMayor;
    }

    public void setLimiteMayor(int limiteMayor) {
        this.limiteMayor = limiteMayor;
    }

    public boolean getEsIgual() {
        return esIgual;
    }

    public void setEsIgual(boolean esIgual) {
        this.esIgual = esIgual;
    }
}

package org.example.cadenaDeResponsabilidades;

public class ManejadorMayor extends Manejador{
    private int limiteMenor;
    private boolean esIgual;

    public ManejadorMayor(int limiteMenor, boolean esIgual) {
        this.limiteMenor = limiteMenor;
        this.esIgual = esIgual;
    }

    @Override
    public boolean manejar(int numero) {
        if (this.esIgual && numero >= limiteMenor) {
            return getSigManejador() == null || getSigManejador().manejar(numero);
        }
        if (numero > limiteMenor){
            return getSigManejador() == null || getSigManejador().manejar(numero);
        }
        return false;
    }

    public int getLimiteMenor() {
        return limiteMenor;
    }

    public void setLimiteMenor(int limiteMenor) {
        this.limiteMenor = limiteMenor;
    }

    public boolean getEsIgual() {
        return esIgual;
    }

    public void setEsIgual(boolean esIgual) {
        this.esIgual = esIgual;
    }
}

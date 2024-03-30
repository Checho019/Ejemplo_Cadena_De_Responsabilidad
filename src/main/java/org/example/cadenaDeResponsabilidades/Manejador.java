package org.example.cadenaDeResponsabilidades;

public abstract class Manejador {
    private Manejador sigManejador;
    public abstract boolean manejar(int numero);
    public Manejador getSigManejador() {
        return sigManejador;
    }
    public void setSigManejador(Manejador sigManejador) {
        this.sigManejador = sigManejador;
    }
}

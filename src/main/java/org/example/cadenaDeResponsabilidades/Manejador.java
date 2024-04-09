package org.example.cadenaDeResponsabilidades;

public abstract class Manejador implements IManejador{
    private Manejador sigManejador;
    public Manejador getSigManejador() {
        return sigManejador;
    }
    public void setSigManejador(Manejador sigManejador) {
        this.sigManejador = sigManejador;
    }
}

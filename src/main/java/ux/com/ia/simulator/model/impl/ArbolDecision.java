package ux.com.ia.simulator.model.impl;

import ux.com.ia.interfaces.Entrenable;
import ux.com.ia.modelos.ModeloIA;

public class ArbolDecision extends ModeloIA implements Entrenable {

    private int profundidadMaxima;

    public ArbolDecision(String nombre, double tasaAprendizaje,int profundidadMaxima    ) {
        super(nombre, tasaAprendizaje);
        this.profundidadMaxima= profundidadMaxima;
    }

    public int getProfundidadMaxima() {
            return profundidadMaxima;
    }

    public void setProfundidadMaxima(int profundidadMaxima) {
        this.profundidadMaxima = profundidadMaxima;
    }

    @Override
    public void ajustarPesos(double tasaAprendizaje) {
        // Simulación de convergencia basada en gradiente (Exponencial)
        this.profundidadMaxima += (1.0 - this.profundidadMaxima) * tasaAprendizaje;
        System.out.println("Profundidad máxima ajustada a: " + this.profundidadMaxima);
    }

    @Override
    public String[] dividirTexto(String parrafo) {
        return new String[0];
    }
}

package ux.com.ia.simulator.model.impl;

import ux.com.ia.modelos.ModeloIA;

public class ArbolDecision extends ModeloIA {

    private int profundidadMaxima;

    public ArbolDecision(String nombre, double tasaAprendizaje, int capasOcultas) {
        super(nombre, tasaAprendizaje,capasOcultas);
    }

    public int getProfundidadMaxima() {
            return profundidadMaxima;
    }

    public void setProfundidadMaxima(int profundidadMaxima) {
        this.profundidadMaxima = profundidadMaxima;
    }
}

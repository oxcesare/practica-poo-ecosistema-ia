package ux.com.ia.simulator.model.impl;

import ux.com.ia.modelos.ModeloIA;

public class RedNeuronal extends ModeloIA {

    private int capasOcultas;


    // Constructor que reciba el nombre,
    // la tasa de aprendizaje y el número de capas ocultas (usando super() para delegar a la clase base).
    public RedNeuronal(String nombre, double tasaAprendizaje, int capasOcultas) {
        super(nombre, tasaAprendizaje,capasOcultas);
    }
}

package ux.com.ia.simulator.model.impl;

import ux.com.ia.interfaces.Entrenable;
import ux.com.ia.modelos.ModeloIA;

public class RedNeuronal extends ModeloIA  implements Entrenable {

    private int capasOcultas;


    // Constructor que reciba el nombre,
    // la tasa de aprendizaje y el número de capas ocultas (usando super() para delegar a la clase base).
    public RedNeuronal(String nombre, double tasaAprendizaje, int capasOcultas) {
        super(nombre, tasaAprendizaje);
        this.capasOcultas= capasOcultas;
    }

    @Override
    public void ajustarPesos(double tasaAprendizaje) {
        // Simulación de convergencia basada en gradiente (Exponencial)
        this.capasOcultas += (1.0 - this.capasOcultas) * tasaAprendizaje;
        System.out.println("ajuste de Capas ajustado a: " + this.capasOcultas);
    }

    @Override
    public String[] dividirTexto(String parrafo) {
        return new String[0];
    }
}

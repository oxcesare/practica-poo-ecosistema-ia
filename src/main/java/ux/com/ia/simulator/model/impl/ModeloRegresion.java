package ux.com.ia.simulator.model.impl;

import ux.com.ia.interfaces.Entrenable;
import ux.com.ia.modelos.ModeloIA;

public class ModeloRegresion extends ModeloIA  implements Entrenable {

    private double coeficienteRegularizacion;

    public ModeloRegresion(String nombre, double tasaAprendizaje, int capasOcultas) {
        super(nombre, tasaAprendizaje);
        this.coeficienteRegularizacion = capasOcultas;
    }

    public double getCoeficienteRegularizacion() {
        return coeficienteRegularizacion;
    }

    public void setCoeficienteRegularizacion(double coeficienteRegularizacion) {
        this.coeficienteRegularizacion = coeficienteRegularizacion;
    }

    @Override
    public void mostrarMetricas() {
        super.mostrarMetricas();
        System.out.println("Coeficiente de Regularización: " + coeficienteRegularizacion);
    }

    @Override
    public void ajustarPesos(double tasaAprendizaje) {
        // Simulación de convergencia basada en gradiente (Exponencial)
        this.coeficienteRegularizacion += (1.0 - this.coeficienteRegularizacion) * tasaAprendizaje;
        System.out.println("coeficienteRegularizacion ajustado a: " + this.coeficienteRegularizacion);
    }

    @Override
    public String[] dividirTexto(String parrafo) {
        return new String[0];
    }
}

package ux.com.ia.simulator.model.impl;

import ux.com.ia.modelos.ModeloIA;

public class ModeloRegresion extends ModeloIA {

    private double coeficienteRegularizacion;

    public ModeloRegresion(String nombre, double tasaAprendizaje, int capasOcultas) {
        super(nombre, tasaAprendizaje,capasOcultas);
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
}

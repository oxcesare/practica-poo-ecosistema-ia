package ux.com.ia;

import ux.com.ia.modelos.ModeloIA;

public class Main {
    public static void main(String[] args) {


        //Instanciar dos objetos de ModeloIA "Red Neuronal" y "ArbolDecision"
        ModeloIA redNeuronal = new ModeloIA("Red Neuronal", 0.01);
        ModeloIA arbolDecision = new ModeloIA("Árbol de Decisión", 0.05);

        redNeuronal.entrenar();
        arbolDecision.entrenar();

        redNeuronal.mostrarMetricas();
        arbolDecision.mostrarMetricas();

    }
}

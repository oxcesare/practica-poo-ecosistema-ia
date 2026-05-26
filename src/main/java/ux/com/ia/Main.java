package ux.com.ia;

import ux.com.ia.modelos.ModeloIA;
import ux.com.ia.simulator.model.impl.ArbolDecision;
import ux.com.ia.simulator.model.impl.ModeloRegresion;
import ux.com.ia.simulator.model.impl.RedNeuronal;

public class Main {
    public static void main(String[] args) {


        //Instanciar clases
        ArbolDecision arbolDecision = new ArbolDecision("Árbol de Decisión", 0.01, 3);
        ModeloRegresion modeloRegresion = new ModeloRegresion("Modelo de Regresión", 0.001, 2);
        RedNeuronal redNeuronal = new RedNeuronal("Red Neuronal", 0.005, 4);

        arbolDecision.entrenar();
        modeloRegresion.entrenar();
        redNeuronal.entrenar();

        arbolDecision.mostrarMetricas();
        modeloRegresion.mostrarMetricas();
        redNeuronal.mostrarMetricas();


    }
}

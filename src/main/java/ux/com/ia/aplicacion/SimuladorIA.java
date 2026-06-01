package ux.com.ia.aplicacion;

import ux.com.ia.interfaces.Entrenable;
import ux.com.ia.simulator.model.impl.ArbolDecision;
import ux.com.ia.simulator.model.impl.ModeloRegresion;
import ux.com.ia.simulator.model.impl.RedNeuronal;

import java.util.List;

public class SimuladorIA {

    public static void main(String[] args) {

        //Colección Genérica: Crea una lista o arreglo de tipo Entrenable[] o List<Entrenable>.
        // Almacena en ella una instancia de RedNeuronal, una de ArbolDecision y una de ModeloRegresion.

        List<Entrenable> modelosEntrenables = List.of(
                new RedNeuronal("Red Neuronal", 0.01, 1),
                new ArbolDecision("Árbol de Decisión", 0.01, 2),
                new ModeloRegresion("Modelo de Regresión", 0.01, 4)
        );

        for (Entrenable entren : modelosEntrenables) {
            entren.ajustarPesos(0.9);
        }


    }
}

package ux.com.ia.interfaces.impl;

import ux.com.ia.interfaces.Entrenable;

public class TokenizadorBasico implements Entrenable {

    @Override
    public void ajustarPesos(double tasaAprendizaje) {

    }

    @Override
    public String[] dividirTexto(String parrafo) {
        if (parrafo == null || parrafo.isEmpty()) {
            return new String[0]; // Retorno seguro en caso de cadenas nulas o vacías
        }

        // Separación directa usando estrictamente el espacio en blanco como delimitador
        return parrafo.split(" ");
    }
}

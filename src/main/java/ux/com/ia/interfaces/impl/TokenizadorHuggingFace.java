package ux.com.ia.interfaces.impl;

import java.util.*;
import ux.com.ia.interfaces.Entrenable;

public class TokenizadorHuggingFace implements Entrenable {

    @Override
    public void ajustarPesos(double tasaAprendizaje) {

    }

    @Override
    public String[] dividirTexto(String parrafo) {
        if (parrafo == null || parrafo.isBlank()) {
            return new String[0]; // Arreglo vacío seguro
        }

        // Almacenamiento temporal dinámico para los tokens fragmentados
        List<String> listaTokens = new ArrayList<>();

        // Vocabulario BPE simulado para mapeos exactos
        Map<String, List<String>> vocabularioCache = Map.of(
                "inteligencia", List.of("intel", "##igencia"),
                "conversacionales", List.of("conversacion", "##ales"),
                "computadora", List.of("computa", "##dora")
        );

        // Separación inicial por espacios en blanco
        String[] palabras = parrafo.split("\\s+");

        for (String palabra : palabras) {
            // Limpieza de signos de puntuación comunes y normalización a minúsculas
            String limpia = palabra.toLowerCase().replaceAll("[.,;:¡!¿?]", "").trim();

            if (limpia.isEmpty()) {
                continue;
            }

            // Caso 1: Coincidencia exacta en el diccionario simulado
            if (vocabularioCache.containsKey(limpia)) {
                listaTokens.addAll(vocabularioCache.get(limpia));
            }
            // Caso 2: Palabra larga genérica -> Simulación de partición WordPiece
            else if (limpia.length() > 5) {
                int mitad = limpia.length() / 2;
                listaTokens.add(limpia.substring(0, mitad));
                listaTokens.add("##" + limpia.substring(mitad));
            }
            // Caso 3: Palabra corta -> Se mantiene entera
            else {
                listaTokens.add(limpia);
            }
        }

        // Conversión final al tipo de retorno String[] exigido por la firma
        return listaTokens.toArray(new String[0]);
    }

}

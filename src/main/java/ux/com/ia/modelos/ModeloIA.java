package ux.com.ia.modelos;

public class ModeloIA {


    private String nombre;
    private double precision;
    private int epocasEntradas;
    private double tasaAprendizaje;
    private int numeroCapasOcultas;

    //Constructor que inicialice nombre y tasa
    public ModeloIA(String nombre, double tasaAprendizaje, int numeroCapasOcultas) {
        this.nombre = nombre;
        this.tasaAprendizaje = tasaAprendizaje;
        this.numeroCapasOcultas = numeroCapasOcultas;
    }

    public double getPrecision() {
        return precision;
    }

    public int getEpocasEntradas() {
        return epocasEntradas;
    }

    public void setTasaAprendizaje(double tasaAprendizaje) {
        this.tasaAprendizaje = tasaAprendizaje;
    }

    public void entrenar() {
        epocasEntradas += 1;
    }

    public void mostrarMetricas() {
        //imprime en consola el estado del Objeto
        System.out.println("Modelo: " + nombre);
        System.out.println("Tasa de Aprendizaje: " + tasaAprendizaje);
        System.out.println("Épocas Entrenadas: " + epocasEntradas);
        System.out.println("Capas de Ocultas: " + numeroCapasOcultas);

    }

}

# Práctica POO - Ecosistema IA

## Cambios implementados

### Encapsulación en `ModeloIA`

Se implementa encapsulación en la clase `ModeloIA` para proteger los atributos `precision` y `epocas`.

#### Antes y después

**Antes (sin encapsulación):**

```java
public class ModeloIA {
    public double precision;
    public int epocas;
}
```

**Después (con encapsulación):**

```java
public class ModeloIA {
    private double precision;
    private int epocas;

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public int getEpocas() {
        return epocas;
    }

    public void setEpocas(int epocas) {
        this.epocas = epocas;
    }
}
```

Con este cambio, el acceso y la modificación de datos se controlan mediante métodos, mejorando la seguridad y mantenibilidad del modelo.


#Implementación del concepto de Herencia en la fase 3
#Se agregan las clases Arbol de Decision y Red Neuronal, que heredan de la clase ModeloIA, 
#permitiendo reutilizar código y mejorar la organización del proyecto.
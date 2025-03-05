package org.juancalocutor.mamiferos;

public class Leon extends Felino {

    private int numManada;
    private float potenciaRugido;

    public Leon(String habitat, String nombreCientifico, float altura, float largo, float peso, float tamGarras,
            int velocidad, int numManada, float potenciaRugido) {
        super(habitat, nombreCientifico, altura, largo, peso, tamGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugido = potenciaRugido;
    }

    public int getNumManada() {
        return numManada;
    }

    public float getPotenciaRugido() {
        return potenciaRugido;
    }

    @Override
    public String comer() {
        return "El león de" + habitat + " es completamente carnívoro";
    }

    @Override
    public String dormir() {
        return "El león duerme en las copas de los árboles o en cuevas";
    }

    @Override
    public String correr() {
        return "El león corre con su manada de " + numManada + " leones";
    }

    @Override
    public String comunicarse() {
        return "El león ruge con una potencia de " + potenciaRugido + " decibeles";
    }

}

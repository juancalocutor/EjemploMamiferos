package org.juancalocutor.mamiferos;

public class Lobo extends Canino {

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, String nombreCientifico, float altura, float largo, float peso, String color,
            float tamColmillos, int numCamada, String especieLobo) {
        super(habitat, nombreCientifico, altura, largo, peso, color, tamColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo come junto con toda su manada de " + numCamada + " individuos";
    }

    @Override
    public String dormir() {
        return "El lobo de especie " + especieLobo + " duerme en cuevas";
    }

    @Override
    public String correr() {
        return "El lobo corre por toda la selva junto a su camada de " + numCamada + " individuos";
    }

    @Override
    public String comunicarse() {
        return "El lobo de especie " + especieLobo + " se comunica mediante aullidos";
    }

}

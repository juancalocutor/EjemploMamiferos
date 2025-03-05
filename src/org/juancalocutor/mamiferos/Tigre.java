package org.juancalocutor.mamiferos;

public class Tigre extends Felino {

    private String especieTigre;

    public Tigre(String habitat, String nombreCientifico, float altura, float largo, float peso, float tamGarras,
            int velocidad, String especieTigre) {
        super(habitat, nombreCientifico, altura, largo, peso, tamGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre " + especieTigre + " come en la " + habitat;
    }

    @Override
    public String dormir() {
        return "El tigre " + especieTigre + " duerme en la copa de los árboles";
    }

    @Override
    public String correr() {
        return "El tigre " + especieTigre + " que vive en " + habitat + " corre rápido porque su peso es de " + peso;
    }

    @Override
    public String comunicarse() {
        return "El tigre " + especieTigre + " se comunica mediante rugidos";
    }

}

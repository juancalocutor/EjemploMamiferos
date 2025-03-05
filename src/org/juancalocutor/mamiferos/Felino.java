package org.juancalocutor.mamiferos;

abstract public class Felino extends Mamifero {

    protected float tamGarras;
    protected int velocidad;
    
    public Felino(String habitat, String nombreCientifico, float altura, float largo, float peso, float tamGarras,
            int velocidad) {
        super(habitat, nombreCientifico, altura, largo, peso);
        this.tamGarras = tamGarras;
        this.velocidad = velocidad;
    }

    public float getTamGarras() {
        return tamGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

}

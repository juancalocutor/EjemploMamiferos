package org.juancalocutor.mamiferos;

abstract public class Canino extends Mamifero {

    protected String color;
    protected float tamColmillos;

    public Canino(String habitat, String nombreCientifico, float altura, float largo, float peso, String color,
            float tamColmillos) {
        super(habitat, nombreCientifico, altura, largo, peso);
        this.color = color;
        this.tamColmillos = tamColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamColmillos() {
        return tamColmillos;
    }

}

package org.juancalocutor.mamiferos;

public class Gato extends Felino {

    private String raza;
    private String color;

    public Gato(String habitat, String nombreCientifico, float altura, float largo, float peso, float tamGarras,
            int velocidad, String raza, String color) {
        super(habitat, nombreCientifico, altura, largo, peso, tamGarras, velocidad);
        this.raza = raza;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String comer() {
        return "El gato de color " + color + " come carne y pescado";
    }

    @Override
    public String dormir() {
        return "El gato de raza " + raza + " duerme sobre el sofa";
    }

    @Override
    public String correr() {
        return "El gato " + color + " corre como loco por toda la casa";
    }

    @Override
    public String comunicarse() {
        return "El gato de raza " + raza + " maulla muy fuerte";
    }

}

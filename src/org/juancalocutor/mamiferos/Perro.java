package org.juancalocutor.mamiferos;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro(String habitat, String nombreCientifico, float altura, float largo, float peso, String color,
            float tamColmillos, int fuerzaMordida) {
        super(habitat, nombreCientifico, altura, largo, peso, color, tamColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro come cereal para perros y muerde con una fuerza de " + fuerzaMordida + " PSI";
    }

    @Override
    public String dormir() {
        return "El perro duerme en el colchón";
    }

    @Override
    public String correr() {
        return "El perro corre por todo el patio de la casa";
    }

    @Override
    public String comunicarse() {
        return "El perro se comunica con los ladridos";
    }

}

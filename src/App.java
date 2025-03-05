import org.juancalocutor.mamiferos.*;

public class App {
    public static void main(String[] args) throws Exception {

        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero leon = new Leon("Selva africana", "Leonus Carnivorus", 97.4f, 125.6f, 76.4f, 3.2f, 60, 9, 120.3f);
        Mamifero gato = new Gato("urbano", "Gatus Mininus", 25.3f, 34.6f, 7.5f, 3.0f, 60, "Angora", "negro");
        Mamifero tigre = new Tigre("Selva africana", "Tigris peligrosus", 123.4f, 192.4f, 76.9f, 3.2f, 55, "Bengala");
        Mamifero lobo = new Lobo("Selva montañosa", "lupus licanus", 95.3f, 123.4f, 87.2f, "Gris", 12, 12, "Siberiano");
        Mamifero perro = new Perro("Urbano", "Perrus Caninus", 53.5f, 98.7f, 15.3f, "negro", 2.5f, 120);

        mamiferos[0] = leon;
        mamiferos[1] = gato;
        mamiferos[2] = tigre;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;

        for (Mamifero mamifero : mamiferos) {
            System.out.println(mamifero.getClass().getSimpleName());
            System.out.println("Habitat " + mamifero.getHabitat());
            System.out.println("Nombre científico " + mamifero.getNombreCientifico());
            System.out.println("Altura " + mamifero.getAltura() + " cms");
            System.out.println("Largo " + mamifero.getLargo() + " cms");
            System.out.println("Peso " + mamifero.getPeso() + " Kgs");

            if (mamifero instanceof Canino) {
                System.out.println("Color " + ((Canino) mamifero).getColor());
                System.out.println("Tamaño de colmillos " + ((Canino) mamifero).getTamColmillos() + " cms");
                if (mamifero instanceof Lobo) {
                    System.out.println("Cantidad de individuos " + ((Lobo) mamifero).getNumCamada());
                    System.out.println("Lobo de la especie " + ((Lobo) mamifero).getEspecieLobo());
                }
                if (mamifero instanceof Perro) {
                    System.out
                            .println("Con una fuerza de mordida de " + ((Perro) mamifero).getFuerzaMordida() + " PSI");
                }
            }

            if (mamifero instanceof Felino) {
                System.out.println("Velocidad " + ((Felino) mamifero).getVelocidad() + " Km/h");
                System.out.println("Tamaño de garras " + ((Felino) mamifero).getTamGarras() + " cms");
                if (mamifero instanceof Gato) {
                    System.out.println("Raza " + ((Gato) mamifero).getRaza());
                    System.out.println("Color " + ((Gato) mamifero).getColor());
                }
                if (mamifero instanceof Tigre) {
                    System.out.println("Especie " + ((Tigre) mamifero).getEspecieTigre());
                }
                if (mamifero instanceof Leon) {
                    System.out.println("Manada de " + ((Leon) mamifero).getNumManada());
                    System.out.println("Ruge con una potencia de " + ((Leon) mamifero).getPotenciaRugido() + " decibeles");
                }
            }

            System.out.println(mamifero.comer());
            System.out.println(mamifero.dormir());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());

            System.out.println();
        }

    }
}

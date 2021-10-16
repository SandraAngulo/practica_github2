package animales;

import animales.entidades.Animal;
import animales.entidades.Caballo;
import animales.entidades.Gato;
import animales.entidades.Perro;

public class Animales {

    public static void main(String[] args) {
        //Declaracion del objeto Perro
        Animal perro = new Perro("Stich", "Carnivoro", 15, "Doberman","negro");
        perro.alimentarse();
        perro.hagoOtraCosa();
        // Declaracion de otro objeto Perro
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chiguagua","marron");
        perro1.alimentarse();
        //Declaracion del objeto Gato
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames","gris");
        gato.alimentarse();
        gato.hagoOtraCosa();
        Animal caballo= new Caballo("Spark", "Pasto", Integer.SIZE, "Fino","blanco");
        caballo.alimentarse();
        caballo.hagoOtraCosa();
    }

}

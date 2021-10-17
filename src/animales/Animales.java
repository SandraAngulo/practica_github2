package animales;

import animales.entidades.Animal;
import animales.entidades.Caballo;
import animales.entidades.Gato;
import animales.entidades.Perro;

public class Animales {

    public static void main(String[] args) {
        //Declaracion del objeto Perro
        Animal perro = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro.alimentarse();
        perro.hagoOtraCosa();
        perro.hagoUnSonido();
        // Declaracion de otro objeto Perro
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chiguagua");
        perro1.alimentarse();
        //Declaracion del objeto Gato
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.alimentarse();
        gato.hagoOtraCosa();
             gato.hagoUnSonido();
        Animal caballo= new Caballo("Spark", "Pasto", Integer.SIZE, "Fino");
        caballo.alimentarse();
        caballo.hagoOtraCosa();
          caballo.hagoUnSonido();
       
   
    }

}

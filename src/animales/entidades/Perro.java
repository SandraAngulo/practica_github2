
package animales.entidades;


public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse() {
        System.out.println("El perro se alimenta de: " + alimento+ "y dice guau");
    }
  
    public  void hagoOtraCosa(){
       
        System.out.println("soy un Perro digo Guaua!!");
        
}
      public void hagoUnSonido(){
          System.out.println("guauuuu");
   }
}
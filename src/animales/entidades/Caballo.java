
package animales.entidades;


public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }
    
    // traer el atributo con super; this. oel atributo directo
    // siempre se debe sobreescribir el metodo y darle
    // para acceder al atributo se puede con 
    @Override
    public void alimentarse(){
        System.out.println("El caballo se alimenta de: "+ super.alimento);
    }
    
   
     public  void hagoOtraCosa(){
         System.out.println("Chauu chicos!!!!"); 
     }       
   
}

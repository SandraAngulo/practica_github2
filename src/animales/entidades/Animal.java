/*
lo importante de la clase abstracta no puede 
ser instanciada. 
* no se pueden crear objetos de esa clase
*/
package animales.entidades;


public abstract class Animal {
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String razaAnimal;

    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }

  

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", razaAnimal=" + razaAnimal + '}';
    }
    // cualquier clase abstracta 
    //puede tener un metodo abstracta //No pueden tener cuerpo
    // por eso no le pongo{}
    
    public abstract void alimentarse();
        
    public  void hagoOtraCosa(){
        
    }
       
   public void hagoUnSonido(){
       
   }

}
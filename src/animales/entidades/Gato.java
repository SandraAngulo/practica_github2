/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales.entidades;

/**
 *
 * @author Sandri
 */
public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String razaAnimal, String color) {
        super(nombre, alimento, edad, razaAnimal, color);
        
    }
    @Override
    public void alimentarse(){
        System.out.println("El gato se alimenta de: " + alimento);
    }
    
    public  void   hagoOtraCosa(){
       
        System.out.println("Hola clase !!!");
}

   
}
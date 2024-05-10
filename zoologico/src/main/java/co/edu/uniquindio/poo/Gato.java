package co.edu.uniquindio.poo;

public class Gato extends Animal{

    /**
     * Metodo constructor de la clase Gato
     * @param nombre
     * @param color
     * @param edad
     */
    public Gato(String nombre, String color, int edad){
        super(nombre, color, edad);
    }

    /**
     * Metodo que define el sonido de un gato
     */
    @Override
    public void hacerSonido(){
        System.out.println("Miau Miau");
    }

    /**
     * Metodo que define como duerme un gato
     */
    @Override
    public void dormir() {
        System.out.println("El Miau Miau esta durmiendo zZzZ");
    }

    /**
     * Metodo que define como come un gato
     */
    @Override
    public void comer() {
        System.out.println("El Miau Miau esta comiendo");
    }
    
}

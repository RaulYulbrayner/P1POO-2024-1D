package co.edu.uniquindio.poo;

public class Pato extends Animal{

    /**
     * Metodo constructor de la clase Pato
     * @param nombre
     * @param color
     * @param edad
     */
    public Pato(String nombre, String color, int edad){
        super(nombre, color, edad);
    }

    /**
     * Metodo que define el sonido de un Pato 
     */
    @Override
    public void hacerSonido(){
        System.out.println("Cuac Cuac");
    }

    /**
     * Metodo que define como duerme un Pato
     */
    @Override
    public void dormir() {
        System.out.println("El Cuac Cuac esta durmiendo zZzZ");
    }

    /**
     * Metodo que define como come un pato
     */
    @Override
    public void comer() {
        System.out.println("El Cuac Cuac es comiendo");
    }
    
}

package co.edu.uniquindio.poo;

public class Perro extends Animal {

    /**
     * Metodo constructor de la clase Perro
     * @param nombre
     * @param color
     * @param edad
     */
    public Perro(String nombre, String color, int edad){
        super(nombre, color, edad);
    }

    /**
     * Metodo que define el sonido de un perro 
     */
    @Override
    public void hacerSonido(){
        System.out.println("Guau Guau");
    }

    /**
     * Metodo que define como duerme un perro
     */
    @Override
    public void dormir() {
        System.out.println("El Guau Guau esta durmiendo zZzZzZ");
    }

    /**
     * Metodo que define como come un perro
     */
    @Override
    public void comer() {
        System.out.println("El Guau Guau esta comiendo");
    }

}

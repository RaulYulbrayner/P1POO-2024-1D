package co.edu.uniquindio.poo;

public abstract class Figura {
    
    private final String nombre;

    /**
     * Metodo constructor de la clase Figura
     * @param nombre
     */
    public Figura(String nombre){
        this.nombre=nombre;
    }

    /**
     * Metodo que permite obtener el nombre de la figura
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo abastracto para calcular el area de una figura
     * @return
     */
    public abstract double calcularArea();

}

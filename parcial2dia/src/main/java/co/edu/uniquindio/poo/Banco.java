package co.edu.uniquindio.poo;

/**
 * Clase para modelar un banco
 */
public class Banco {
    
    private String nombre;

    /**
     * Metodo constructor del banco
     * @param nombre
     */
    public Banco(String nombre){
        assert nombre != null && !nombre.isBlank();
        this.nombre=nombre;
    }

}

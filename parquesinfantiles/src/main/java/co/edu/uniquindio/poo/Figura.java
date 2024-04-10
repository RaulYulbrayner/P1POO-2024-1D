package co.edu.uniquindio.poo;

/**
 * Clase abstracta para definir que toda figura geométrica debe tener un método
 * calcularArea.
 * 
 * @author Área de programación UQ
 * @since 2024-04
 
 * Licencia GNU/GPL V3.0
 * (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public abstract class Figura {

    /**
     * Método abstracto para definir que toda figura
     * geométrica que implemente esta interfaz debe tener un método calcularArea.
     * @return valor del área de la figura que implementa la interfaz
     */
    public abstract double calcularArea();

}

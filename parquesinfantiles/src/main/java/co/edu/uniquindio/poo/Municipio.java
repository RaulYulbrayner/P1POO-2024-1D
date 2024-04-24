package co.edu.uniquindio.poo;

/**
 * Clase de tipo enumeración con el valor del metro cuadrado
 * asociado a cada material
 * 
 * @author Área de programación UQ
 * @since 2024-04
 * 
 *        Licencia GNU/GPL V3.0
 *        (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public enum Municipio {
    // Cada material es en realidad un objeto
    ARMENIA(0.0),
    CALARCA(10000.0),
    MONTENEGRO(20000.0),
    QUIMBAYA(30000.0),
    TEBAIDA(15000.0),
    CIRCASIA(18000.0),
    FILANDIA(22000.0),
    GENOVA(70000.0),
    SALENTO(50000.0),
    PIJAO(40000.0),
    CORDOBA(30000.0),
    BUENAVISTA(35000.0);

    private final double sobrecosto;

    /**
     * Método constructor de la clase tipo enumeración
     * 
     * @param sobrecosto valor del sobrecosto asociado al municipio
     */
    private Municipio(double sobrecosto) {
        this.sobrecosto = sobrecosto;
    }

    /**
     * Método para obtener el valor del sobrecosto asociado al municipio
     * 
     * @return valor del sobrecosto asociado al municipio
     */
    public double getSobrecosto() {
        return sobrecosto;
    }

}

package co.edu.uniquindio.poo;

public class Cuadrado extends Rectangulo {
    private final double lado;

    /**
     * Metodo constructor de la clase cuadrado
     * @param lado
     */
    public Cuadrado(double lado){
        super(lado, lado);
        this.lado=lado;
    }
    
}

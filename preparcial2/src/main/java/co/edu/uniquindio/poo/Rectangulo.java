package co.edu.uniquindio.poo;

public class Rectangulo extends Figura {
    private final double ancho, alto;

    /**
     * Metodo constructor de la clase Rectangulo
     * @param ancho
     * @param alto
     */
    public Rectangulo(double ancho, double alto){
        super("Rectangulo");
        this.ancho=ancho;
        this.alto=alto;
    }

    /**
     * Metodo que permite calcular el area de un Rectangulo
     */
    public double calcularArea(){
        return ancho*alto;
    }

    /**
     * Metedo que permite obtener el ancho de un Rectangulo
     * @return
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * Metedo que permite obtener el alto de un Rectangulo
     * @return
     */
    public double getAlto() {
        return alto;
    }
    
}

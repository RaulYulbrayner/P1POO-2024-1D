package co.edu.uniquindio.poo;

/**
 * Clase que agrupa los datos de un rectangulo
 */
public class Rectangulo extends Figura {

    private double alto, ancho;

    /**
     * Método constructor de la clase Rectangulo
     * @param ancho valor del ancho del rectángulo
     * @param alto valor del alto del rectángulo
     */
    public Rectangulo(double ancho, double alto){
        this.ancho=ancho;
        this.alto=alto;
    }

    /**
     * Método para calcular el valor del área del rectángulo
     * @return valor del área del rectángulo
     */
    public double calcularArea(){
        assert ancho >= 0;
        assert alto >= 0;
        return alto * ancho;
    }

    /**
     * Método para obtener el valor del alto del rectángulo
     * @return valor del alto del rectángulo
     */
    public double getAlto() {
        return alto;
    }

    /**
     * Método para obtener el valor del ancho del rectángulo 
     * @return valor del ancho del rectángulo
     */
    public double getAncho() {
        return ancho;
    }
    
}

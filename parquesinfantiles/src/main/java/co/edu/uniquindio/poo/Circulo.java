package co.edu.uniquindio.poo;

public class Circulo extends Figura {

    private double radio;

    /**
     * Este es el metodo constructor de la clase circulo
     * @param radio
     */
    public Circulo(double radio){
        assert radio > 0;
        this.radio=radio;
    }

    /**
     * Metodo para calcular el area de un circulo
     * @return area
     */
    public double calcularArea(){
        return Math.PI*Math.pow(radio, 2);
    }

    /**
     * Método para obtener el valor del radio del círculo
     * @return valor del radio del círculo
     */
    public double getRadio() {
        return radio;
    }

    
    
}

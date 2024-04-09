package co.edu.uniquindio.poo;

public class Circulo extends Figura {

    private double radio;

    /**
     * 
     * @param radio
     */
    public Circulo(double radio){
        assert radio > 0;
        this.radio=radio;
    }

    public double calcularArea(){
        return Math.PI*Math.pow(radio, 2);
    }
    
}

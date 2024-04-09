package co.edu.uniquindio.poo;

public class Rectangulo extends Figura {

    private double alto, ancho;

    public Rectangulo(double ancho, double alto){
        this.ancho=ancho;
        this.alto=alto;
    }

    public double calcularArea(){
        assert ancho >= 0;
        assert alto >= 0;
        return alto * ancho;
    }
    
}

package co.edu.uniquindio.poo;

public class Triangulo extends Figura {

    private double base, altura;

    /**
     * Metodo constructor de la clase triangulo
     * @param base
     * @param altura
     */
    public Triangulo(double base, double altura){
        assert base > 0;
        assert altura > 0;
        this.base= base;
        this.altura=altura;
    }

    /**
     * Metodo que permite calulcar el area del triangulo
     */
    public double calcularArea(){
        return (base * altura)/2.0;
    }

    /**
     * Metodo para obtener la base de un triangulo
     * @return
     */
    public double getBase() {
        return base;
    }

    /**
     * Metodo para obtener la altura de un triangulo
     * @return
     */
    public double getAltura() {
        return altura;
    }
    
}

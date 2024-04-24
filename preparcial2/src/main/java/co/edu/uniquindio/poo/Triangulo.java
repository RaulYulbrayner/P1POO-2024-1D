package co.edu.uniquindio.poo;

public class Triangulo extends Figura {
    private final double base, altura;

    /**
     * Metodo constructor de la clase Triangulo
     * @param base
     * @param altura
     */
    public Triangulo(double base, double altura){
        super("Triangulo");
        this.base=base;
        this.altura=altura;
    }

    /**
     * Metodo que permite calcular el area de un Triangulo
     */
    public double calcularArea(){
        return (base*altura)/2.0;
    }

    /**
     * Metedo que permite obtener la base de un triangulo
     * @return
     */
    public double getBase() {
        return base;
    }

    /**
     * Metedo que permite obtener la altura de un triangulo
     * @return
     */
    public double getAltura() {
        return altura;
    }
    
}

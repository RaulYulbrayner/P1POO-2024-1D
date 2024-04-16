package co.edu.uniquindio.poo;

public enum Material {
    ARENA(10000),
    GRAMASINTECTICA(35000),
    GRAMANATURAL(20000),
    ASFALTO(40000);

    public double valorMetroCuadrado;

    private Material(double valorMetroCuadrado){
        this.valorMetroCuadrado=valorMetroCuadrado;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }
    
}

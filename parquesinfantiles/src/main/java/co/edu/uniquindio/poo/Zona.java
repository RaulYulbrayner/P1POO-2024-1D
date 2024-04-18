package co.edu.uniquindio.poo;

public class Zona {

    private String nombre;
    private Material material;
    private Figura figura;

    /**
     * Metodo constructor de la clase Zona
     * @param nombre
     * @param material
     * @param figura
     */
    public Zona(String nombre, Material material, Figura figura){
        this.nombre=nombre;
        this.material=material;
        this.figura=figura;
    }

    /**
     * Metodo que permite calcular el costo de una figura por area
     * @return
     */
    public double calcularCosto(){
        return figura.calcularArea()*material.getValorMetroCuadrado();
    }

    /**
     * Metodo para obtener el nombre de la Zona
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener el material de la Zona
     * @return
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Metodo para obtener la figura de la Zona
     * @return
     */
    public Figura getFigura() {
        return figura;
    }
    
}

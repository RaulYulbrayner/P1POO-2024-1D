package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Parque {

    private final String nombre;
    private final String descripcion;
    private final Municipio municipio;
    private final Collection<Zona> zonas;

    /**
     * Método constructor de la clase ParqueInfantil
     * @param nombre      nombre del parque infantil
     * @param descripcion descripción del parque infantil
     * @param municipio   municipio en donde se diseñó el parque
     */
    public Parque(String nombre, String descripcion, Municipio municipio) {
        assert nombre != null : "Error, el nombre del parque infantil no puede ser nulo";
        assert !nombre.isBlank() : "Error, el nombre del parque infantil no puede ser vacio";
        assert descripcion != null : "Error, la descripción del parque infantil no puede ser nulo";
        assert !descripcion.isBlank() : "Error, la descripción del parque infantil no puede ser vacio";

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.municipio = municipio;

        this.zonas = new LinkedList<>();
    }

    /**
     * Método para obtener el nombre del parque infantil 
     * @return nombre del parque infantil
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la descripción del parque infantil 
     * @return descripción del parque infantil
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método para adicionar una zona al parque infantil 
     * @param zona zona que se desea agregar
     */
    public void agregarZona(Zona zona) {
        assert !existeZonaParque(zona.getNombre());
        zonas.add(zona);
    }

    /**
     * Método para obtener el municipio para el que se definió el parque infantil
     * @return municipio para el que se definió el parque
     */
    public Municipio getMunicipio() {
        return municipio;
    }

    /**
     * Método para calcular el valor del parque infantil 
     * @return valor del parque infantil
     */
    public double calcularValor() {
        double total = 0;
        for(Zona zonaParque : zonas) {
            total += zonaParque.calcularCosto();
        }
        total += municipio.getSobrecosto();
        return total;
      }

    /**
     * Método privado para determinar si ya existe otra zona con el mismo nombre
     * @param nombre nombre del que se desea saber si está o no en uso en otra zona
     * @return valor lógico que indica si existe o no una zona con el nombre
     *         indicado
     */
    private boolean existeZonaParque(String nombre) {
        for(Zona zona : zonas) {
            if (zona.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

}


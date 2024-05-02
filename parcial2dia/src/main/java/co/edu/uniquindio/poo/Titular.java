package co.edu.uniquindio.poo;

/**
 * Clase para modelar un titular
 */
public class Titular {

    private String nombre_titular, apellido_titular;

    /**
     * Metodo constructor del titular de la cuenta
     * @param nombre_titular
     * @param apellido_titular
     */
    public Titular(String nombre_titular, String apellido_titular){
        assert nombre_titular != null && !nombre_titular.isBlank();
        assert apellido_titular != null && !apellido_titular.isBlank();
        this.nombre_titular=nombre_titular;
        this.apellido_titular=apellido_titular;
    }

    /**
     * Metodo para obtener el nombre del titular de la cuenta
     * @return nombre_titular
     */
    public String getNombre_titular() {
        return nombre_titular;
    }

    /**
     * Metodo para modificar el nombre del titular de la cuenta
     * @param nombre_titular
     */
    public void setNombre_titular(String nombre_titular) {
        this.nombre_titular = nombre_titular;
    }

    /**
     * Metodo para obtener el apellido del titular de la cuenta
     * @return apellido_titular
     */
    public String getApellido_titular() {
        return apellido_titular;
    }

    /**
     * Metodo para modificar el apellido del titular de la cuenta
     * @param apellido_titular
     */
    public void setApellido_titular(String apellido_titular) {
        this.apellido_titular = apellido_titular;
    }

}

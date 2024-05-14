package co.edu.uniquindio.poo;

public class Cliente extends Persona implements ICliente {
    public String telefono;

    public Cliente(String nombre, String apellidos, String telefono) {
        super(nombre, apellidos);
        this.telefono=telefono;
    }

    @Override
    public int MaxComprasDiarias() {
        return ICliente.MAXIMO_COMPRAS_DIARIAS;
    }

    @Override
    public String Email() {
        return Email();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nTeléfono: " + telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
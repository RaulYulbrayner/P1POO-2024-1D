package co.edu.uniquindio.poo;

public record Estudiante(String nombre, String apellido, String identificacion, String correo, String telefono, int edad) {

    public Estudiante{
        assert nombre != null;
        assert apellido != null;
        assert identificacion != null;
        assert correo != null;
        assert telefono != null;
    }
    
}

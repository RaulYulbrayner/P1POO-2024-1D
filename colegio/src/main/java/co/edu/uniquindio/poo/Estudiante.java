package co.edu.uniquindio.poo;

public record Estudiante(String nombre, String apellido, String identificacion, String correo, String telefono, int edad) {

    public Estudiante{
        assert nombre != null && !nombre.isBlank() :"El nombre del estudiante no puede ser null y tampoco puede ser vacio";

        assert apellido != null && !apellido.isBlank() :"El apellido del estudiante no puede ser null y tampoco puede ser vacio";

        assert identificacion != null && !identificacion.isBlank() :"El identificación del estudiante no puede ser null y tampoco puede ser vacio";

        assert correo != null && !correo.isBlank() && correo.contains("@") :"El correo del estudiante no puede ser null y tampoco puede ser vacio";

        assert telefono != null && !telefono.isBlank() :"El telefono del estudiante no puede ser null y tampoco puede ser vacio";

        assert edad >= 0;

    }
    
}

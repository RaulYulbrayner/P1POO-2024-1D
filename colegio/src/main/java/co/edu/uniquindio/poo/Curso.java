package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Curso {

    private String nombre;
    private Collection <Estudiante> estudiantes;

    /**
     * Constructor de la clase curso
     * @param nombre
     */
    public Curso(String nombre){
        assert nombre != null;
        estudiantes = new LinkedList<>();
        this.nombre = nombre;
    }

    /**
     * Metodo para agregar estudiantes
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante){
        assert verificarEstudianteExiste(estudiante.identificacion()) == false;
        estudiantes.add(estudiante);
    }
    
    /**
     * Metodo para verificar que el ID del estudiante no se repita en la lista de estudiantes
     * @param numID
     * @return existe
     */
    private boolean verificarEstudianteExiste(String numID){
        boolean existe = false;
        for(Estudiante estudiante : estudiantes){
            if(estudiante.identificacion().equals(numID)){
                existe = true;
            }
        }
        return existe;
    }

    /**
     * Metodo get para obtener el nombre del curso
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener la lista de estudiantes
     * @return estudiantes
     */
    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Collection<Estudiante> obtenerMenorEdad(){
        Collection<Estudiante> listaEdadResultado = new LinkedList<>();
        for(Estudiante estudiante: estudiantes){
            if(estudiante.edad()<18){
                listaEdadResultado.add(estudiante);
            }
        }
        return listaEdadResultado;
    }

    
}

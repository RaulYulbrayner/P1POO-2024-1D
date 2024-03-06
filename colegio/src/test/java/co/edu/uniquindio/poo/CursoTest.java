package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CursoTest {
    
    private static final Logger LOG = Logger.getLogger(CursoTest.class.getName());

    /**
     * Prueba para verificar que el nombre del curso este correcto
     */
    @Test
    public void datosCompletosCurso(){
        LOG.info("Inicio test datosCompletosCurso");
        Curso curso = new Curso("Programación 1");
        assertEquals("Programación 1", curso.getNombre());
        LOG.info("Fin test datosCompletosCurso");
    }

    /**
     * Prueba para verificar que los datos del curso no esten nulos
     */
    @Test
    public void datosNulosCurso(){
        LOG.info("Inicio test datosCompletosCurso");
        assertThrows(Throwable.class, ()-> new Curso(null));
        LOG.info("Fin test datosCompletosCurso");
    }

    /**
     * Prueba para registrar estudiantes
     */
    @Test
    public void registrarEstudiante(){
        LOG.info("Inicio test registrarEstudiante");
        Curso curso = new Curso("Programación 1");
        Estudiante estudiante = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674", 18);

        curso.agregarEstudiante(estudiante);
        assertTrue(curso.getEstudiantes().contains(estudiante));
        assertEquals(1, curso.getEstudiantes().size());

        LOG.info("Fin test registrarEstudiante");
    }

    /**
     * 
     */
    @Test
    public void verificarIdEstudiante(){
        LOG.info("Inicio test verificarIdEstudiante");
        Curso curso = new Curso("Programación 1");

        Estudiante estudiante1 = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674", 18);

        Estudiante estudiante2 = new Estudiante("Raul", "Rivera", "109453264", "raul@uniquindio.edu.co", "315635674", 25);

        curso.agregarEstudiante(estudiante1);

        assertThrows(Throwable.class, ()-> curso.agregarEstudiante(estudiante2));
        

        LOG.info("Fin test verificarIdEstudiante");
    }

    /**
     * 
     */
    @Test
    public void verificarEdadMayor(){
        LOG.info("Inicio test verificarEdadMayor");

        Curso curso = new Curso("Programación 1");

        Estudiante estudiante1 = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674", 17);

        Estudiante estudiante2 = new Estudiante("Raul", "Rivera", "164", "raul@uniquindio.edu.co", "315635674", 25);

        Estudiante estudiante3 = new Estudiante("Juan", "Rivera", "1094564", "raul@uniquindio.edu.co", "315635674", 10);

        Estudiante estudiante4 = new Estudiante("Ana", "Rivera", "109264", "raul@uniquindio.edu.co", "315635674", 35);

        curso.agregarEstudiante(estudiante1);
        curso.agregarEstudiante(estudiante2);
        curso.agregarEstudiante(estudiante3);
        curso.agregarEstudiante(estudiante4);

        Collection<Estudiante> listaMenorEdad = List.of(estudiante1, estudiante3);
        assertIterableEquals(listaMenorEdad, curso.obtenerMenorEdad());

        LOG.info("Fin test verificarEdadMayor");
    }




}

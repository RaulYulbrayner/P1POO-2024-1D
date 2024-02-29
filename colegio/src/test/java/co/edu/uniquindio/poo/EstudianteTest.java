/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    /**
     * Caso de prueba para validar a un estudiante 
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");
        
        Estudiante estudiante = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674", 18);

        assertEquals("Camila", estudiante.nombre());
        assertEquals("Alzate Rios", estudiante.apellido());
        assertEquals("109453264", estudiante.identificacion());
        assertEquals("camila@uniquindio.edu.co", estudiante.correo());
        assertEquals("315635674", estudiante.telefono());
        assertEquals( 18, estudiante.edad());

        LOG.info("Finalizando test datosCompletos");
    }

    /**
     * Prueba para verificar que los datos de un estudiante no esten nulos
     */
    @Test
    public void datosNulos(){
        LOG.info("Inicio prueba datosNulos");
        assertThrows(Throwable.class, ()-> new Estudiante(null, null, null, null, null, 0));
        LOG.info("Finalizacion datosNulos");
    }

    /**
     * Prueba para verificar que los datos de un estudiante no esten nulos
     */
    @Test
    public void datosVacios(){
        LOG.info("Inicio prueba datosVacios");
        assertThrows(Throwable.class, ()-> new Estudiante("", "", "", "", "", 0));
        LOG.info("Finalizacion datosVacios");
    }

    /**
     * Prueba para verificar que la edad de un estudiante no sea negativa
     */
    @Test
    public void edadNegativa(){
        LOG.info("Inicio prueba edadNegativa");
        assertThrows(Throwable.class, ()-> new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674", -18));
        LOG.info("Finalizacion prueba edadNegativa");
    }


    /**
     * Prueba para verificar el correo electronico de un estudiante este bueno
     */
    @Test
    public void correoInvalido(){
        LOG.info("Inicio prueba correoInvalido");
        assertThrows(Throwable.class, ()-> new Estudiante("Camila", "Alzate Rios", "109453264", "camilauniquindio.edu.co", "315635674", 18));
        LOG.info("Finalizacion prueba correoInvalido");
    }



}

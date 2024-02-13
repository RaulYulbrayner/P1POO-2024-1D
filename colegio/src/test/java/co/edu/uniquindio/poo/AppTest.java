/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Caso de prueba para validar a un estudiante 
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");
        
        Estudiante estudiante = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674", (byte) 18);

        assertEquals("Camila", estudiante.nombre());
        assertEquals("Alzate Rios", estudiante.apellido());
        assertEquals("109453264", estudiante.identificacion());
        assertEquals("camila@uniquindio.edu.co", estudiante.correo());
        assertEquals("315635674", estudiante.telefono());
        assertEquals((byte) 18, estudiante.edad());

        LOG.info("Finalizando test datosCompletos");
    }
}

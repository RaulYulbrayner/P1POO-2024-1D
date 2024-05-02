/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Cuenta de ahorro
 */
public class CuentaCorrienteTest {
    private static final Logger LOG = Logger.getLogger(CuentaAhorroTest.class.getName());

    /**
     * Metodo de prueba para depositar dinero en una cuenta corriente
     */
    @Test
    public void depositarEnCuentaCorriente() {
        LOG.info("Iniciado test depositarEnCuentaCorriente");

        CuentaCorriente cuentaCorriente = new CuentaCorriente(new Titular("Juan", "Pérez"), 123456789, 100000, false, 0.05);

        cuentaCorriente.depositar(10000);
        assertEquals(110000, cuentaCorriente.getSaldo());
        
        LOG.info("Finalizando test depositarEnCuentaCorriente");
    }

    /**
     * Metodo de prueba para depositar dinero en una cuenta de ahorros
     */
    @Test
    public void retirarEnCuentaCorriente() {
        LOG.info("Iniciado test retirarEnCuentaCorriente");

        CuentaCorriente cuentaCorriente = new CuentaCorriente(new Titular("Juan", "Pérez"), 123456789, 100000, false, 0.05);

        cuentaCorriente.retirar(8000);

        assertEquals(92000, cuentaCorriente.getSaldo());
        
        LOG.info("Finalizando test retirarEnCuentaCorriente");
    }

    
}

/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Cuenta de ahorro
 */
public class CuentaAhorroTest {
    private static final Logger LOG = Logger.getLogger(CuentaAhorroTest.class.getName());

    /**
     * Metodo de prueba para depositar dinero en una cuenta de ahorros
     */
    @Test
    public void depositarEnCuentaAhorro() {
        LOG.info("Iniciado test depositarEnCuentaAhorro");

        CuentaAhorros cuentaAhorro = new CuentaAhorros(new Titular("Juan", "Pérez"), 123456789, 100000, false, 0.05);

        cuentaAhorro.depositar(10000);
        assertEquals(110000, cuentaAhorro.getSaldo());
        
        LOG.info("Finalizando test depositarEnCuentaAhorro");
    }

    /**
     * Metodo de prueba para depositar dinero en una cuenta de ahorros
     */
    @Test
    public void retirarEnCuentaAhorro() {
        LOG.info("Iniciado test retirarEnCuentaAhorro");

        CuentaAhorros cuentaAhorro = new CuentaAhorros(new Titular("Juan", "Pérez"), 123456789, 100000, false, 0.05);

        cuentaAhorro.retirar(8000);

        assertEquals(92000, cuentaAhorro.getSaldo());
        
        LOG.info("Finalizando test retirarEnCuentaAhorro");
    }

    /**
     * Metodo de prueba para depositar dinero en una cuenta de ahorros
     */
    @Test
    public void cuentaInactivaRetirarSaldo() {
        LOG.info("Iniciado test cuentaInactivaRetirarSaldo");

        CuentaAhorros cuentaAhorro = new CuentaAhorros(new Titular("Juan", "Pérez"), 123456789, 100000, false, 0.05);

        cuentaAhorro.retirar(100000);

        assertEquals(0, cuentaAhorro.getSaldo());
        assertFalse(cuentaAhorro.getCuenta_activa());
        
        LOG.info("Finalizando test cuentaInactivaRetirarSaldo");
    }

}

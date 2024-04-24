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

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PlanoTest {
    private static final Logger LOG = Logger.getLogger(PlanoTest.class.getName());

    /**
     * Metodo de prueba para verificar que una Coleccion no este vacia
     */
    @Test
    public void ColeccionVacia() {
        LOG.info("Iniciado test ColeccionVacia");

        var figuras = new LinkedList<Figura>();
        var figurasOrdenadas = Plano.ordenar(figuras);
        assertEquals(0, figurasOrdenadas.size());

        LOG.info("Finalizando test ColeccionVacia");
    }

    /**
     * Metodo de prueba para verificar el orden de una Coleccion 
     */
    @Test
    public void ColeccionDatos() {
        LOG.info("Iniciado test ColeccionDatos");
        Triangulo t1 = new Triangulo(40, 4);
        Triangulo t2 = new Triangulo(50, 4);
        Rectangulo r1 = new Rectangulo(10, 20);
        Rectangulo r2 = new Rectangulo(40, 3);
        Cuadrado c1 = new Cuadrado(5);
        Cuadrado c2 = new Cuadrado(30);
        var figuras = List.of(t1, t2, r1, r2, c1, c2);
        var figurasEsperadas = List.of(c1, t1, t2, r2, r1, c2);
        var figurasOrdenadas = Plano.ordenarFigura(figuras);
        assertEquals(figurasEsperadas, figurasOrdenadas);
        LOG.info("Finalizando test ColeccionDatos");
    }

    /**
     * Metodo de prueba para verificar que una Coleccion no este nula
     */
    @Test
    public void ColeccionNulo() {
        LOG.info("Iniciado test ColeccionNulo");
        assertThrows(Throwable.class, () -> 
            Plano.ordenar(null));
        LOG.info("Finalizando test ColeccionNulo");
    }
}

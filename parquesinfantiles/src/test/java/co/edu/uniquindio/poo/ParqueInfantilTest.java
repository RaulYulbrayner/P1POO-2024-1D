package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class ParqueInfantilTest {
    private static final Logger LOG = Logger.getLogger(ParqueInfantilTest.class.getName());

    @Test
    public void ParqueInfantilNombreNulo() {
        LOG.info("Iniciado test ParqueInfantilNombreNulo");

        assertThrows(Throwable.class, () -> new Parque(null, "Descripción", Municipio.ARMENIA));

        LOG.info("Finalizando test ParqueInfantilNombreNulo");
    }

    @Test
    public void ParqueInfantilNombreVacio() {
        LOG.info("Iniciado test ParqueInfantilNombreVacio");

        assertThrows(Throwable.class, () -> new Parque("", "Descripción", Municipio.ARMENIA));

        LOG.info("Finalizando test ParqueInfantilNombreVacio");
    }

    @Test
    public void ParqueInfantilDescripcionNula() {
        LOG.info("Iniciado test ParqueInfantilDescripcionNula");

        assertThrows(Throwable.class, () -> new Parque("Nombre", null, Municipio.ARMENIA));

        LOG.info("Finalizando test ParqueInfantilDescripcionNula");
    }

    @Test
    public void ParqueInfantilDescripcionVacia() {
        LOG.info("Iniciado test ParqueInfantilDescripcionVacia");

        assertThrows(Throwable.class, () -> new Parque("Nombre", "", Municipio.ARMENIA));

        LOG.info("Finalizando test ParqueInfantilDescripcionVacia");
    }

    @Test
    public void ValorParqueSinZonas() {
        LOG.info("Iniciado test ValorParqueSinZonas");

        var parque = new Parque("Mi primer recuerdo", "Parque para los primero años de edad", Municipio.CALARCA);

        assertEquals(10000.0, parque.calcularValor(), App.PRECISION);

        LOG.info("Finalizando test ValorParqueSinZonas");
    }

    @Test
    public void ValorParqueUnaZonaCircular() {
        LOG.info("Iniciado test ValorParqueUnaZonaCircular");

        var parque = new Parque("Mi primer recuerdo", "Parque para los primero años de edad", Municipio.CALARCA);

        parque.agregarZona(new Zona("Zona de mascotas", Material.ARENA, new Circulo(10)));

        assertEquals(3151592.65, parque.calcularValor(), App.PRECISION);

        LOG.info("Finalizando test ValorParqueUnaZonaCircular");
    }

    @Test
    public void ValorParqueCuatroZonas() {
        LOG.info("Iniciado test ValorParqueCuatroZonas");

        var parque = new Parque("Mi primer recuerdo", "Parque para los primero años de edad", Municipio.CALARCA);

        parque.agregarZona(new Zona("Zona de mascotas", Material.ARENA, new Circulo(10)));

        parque.agregarZona(new Zona("Zona rectangular", Material.GRAMASINTECTICA, new Rectangulo(10, 20)));

        parque.agregarZona(new Zona("Zona cuadrada", Material.GRAMANATURAL, new Cuadrado(10)));

        parque.agregarZona(new Zona("Zona triangular", Material.ARENA, new Triangulo(10, 20)));

        assertEquals(13151592.65, parque.calcularValor(), App.PRECISION);

        LOG.info("Finalizando test ValorParqueCuatroZonas");
    }

    @Test
    public void ParqueZonasIgualNombre() {
        LOG.info("Iniciado test ParqueZonasIgualNombre");

        var parque = new Parque("Mi primer recuerdo", "Parque para los primero años de edad", Municipio.CALARCA);

        parque.agregarZona(new Zona("Zona de mascotas", Material.ARENA ,new Circulo(10)));

        assertThrows(Throwable.class, () -> parque.agregarZona(new Zona("Zona de mascotas", Material.ARENA, new Circulo(10))));

        LOG.info("Finalizando test ParqueZonasIgualNombre");
    }

}


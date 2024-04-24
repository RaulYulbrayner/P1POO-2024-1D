package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

/**
 * Clase para probar la clase ProyectoGobernacion
 * 
 * @author Área de programación UQ
 * @since 2024-04
 * 
 *        Licencia GNU/GPL V3.0
 *        (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public class ProyectoGobernacionTest {
    private static final Logger LOG = Logger.getLogger(ProyectoGobernacionTest.class.getName());

    @Test
    public void ValorProyectoSinParques() {
        LOG.info("Iniciado test ValorProyectoSinParques");

        var proyecto = new ProyectoGobernacion();

        assertEquals(0.0, proyecto.calcularValorProyecto(), App.PRECISION);

        LOG.info("Finalizando test ValorProyectoSinParques");
    }

    @Test
    public void ObtenerParqueNombre() {
        LOG.info("Iniciado test ObtenerParqueNombre");

        var proyecto = new ProyectoGobernacion();
        var parque = new Parque("Mi primer recuerdo", "Parque para los primero años de edad", Municipio.CALARCA);

        proyecto.addParqueInfantil(parque);

        assertEquals(parque, proyecto.getParque("Mi primer recuerdo"));

        LOG.info("Finalizando test ObtenerParqueNombre");
    }

    @Test
    public void ObtenerParqueNombreNoExiste() {
        LOG.info("Iniciado test ObtenerParqueNombreNoExiste");

        var proyecto = new ProyectoGobernacion();

        assertThrows(Throwable.class, () -> proyecto.getParque("Mi recuerdo"));

        LOG.info("Finalizando test ObtenerParqueNombreNoExiste");
    }

    @Test
    public void ParquesConIgualNombre() {
        LOG.info("Iniciado test ParquesConIgualNombre");

        var proyecto = new ProyectoGobernacion();
        var parque = new Parque("Mi primer recuerdo", "Parque para los primero años de edad", Municipio.CALARCA);

        proyecto.addParqueInfantil(parque);

        assertThrows(Throwable.class, () -> proyecto.addParqueInfantil(parque));

        LOG.info("Finalizando test ParquesConIgualNombre");
    }

    @Test
    public void ObtenerMunicipioSinParques() {
        LOG.info("Iniciado test ObtenerMunicipioSinParques");

        var proyecto = new ProyectoGobernacion();

        assertEquals(0, proyecto.getParquesMunicipio("GENOVA").size());

        LOG.info("Finalizando test ObtenerMunicipioSinParques");
    }

    @Test
    public void ObtenerMunicipioInexistente() {
        LOG.info("Iniciado test ObtenerMunicipioInexistente");

        var proyecto = new ProyectoGobernacion();

        assertEquals(0, proyecto.getParquesMunicipio("SEVILLA").size());

        LOG.info("Finalizando test ObtenerMunicipioInexistente");
    }

    @Test
    public void ParquesMunicipio() {
        LOG.info("Iniciado test ParquesMunicipio");

        var proyecto = new ProyectoGobernacion();

        var pijao1 = new Parque("P1", "D1", Municipio.PIJAO);
        var cordoba1 = new Parque("P2", "D2", Municipio.CORDOBA);
        var buenavista1 = new Parque("P3", "D3", Municipio.BUENAVISTA);
        var pijao2 = new Parque("P4", "D4", Municipio.PIJAO);
        var cordoba2 = new Parque("P5", "D5", Municipio.CORDOBA);
        var buenavista2 = new Parque("P6", "D6", Municipio.BUENAVISTA);

        proyecto.addParqueInfantil(pijao1);
        proyecto.addParqueInfantil(cordoba1);
        proyecto.addParqueInfantil(buenavista1);

        proyecto.addParqueInfantil(pijao2);
        proyecto.addParqueInfantil(cordoba2);
        proyecto.addParqueInfantil(buenavista2);

        Collection<Parque> listaEsperada = List.of(pijao1, pijao2);

        assertIterableEquals(listaEsperada, proyecto.getParquesMunicipio("PIJAO"));

        LOG.info("Finalizando test ParquesMunicipio");
    }



    @Test
    public void OrdenPorValor() {
        LOG.info("Iniciado test OrdenPorValor");

        var proyecto = new ProyectoGobernacion();

        var pijao1 = new Parque("P1", "D1", Municipio.PIJAO);
        var cordoba1 = new Parque("P2", "D2", Municipio.CORDOBA);
        var buenavista1 = new Parque("P3", "D3", Municipio.BUENAVISTA);
        var pijao2 = new Parque("P4", "D4", Municipio.PIJAO);
        var cordoba2 = new Parque("P5", "D5", Municipio.CORDOBA);
        var buenavista2 = new Parque("P6", "D6", Municipio.BUENAVISTA);

        var zona = new Zona("Zona 1", Material.ASFALTO, new Cuadrado(15));

        pijao1.agregarZona(zona);
        cordoba1.agregarZona(zona);
        buenavista1.agregarZona(zona);

        pijao2.agregarZona(zona);
        cordoba2.agregarZona(zona);
        buenavista2.agregarZona(zona);

        proyecto.addParqueInfantil(pijao1);
        proyecto.addParqueInfantil(cordoba1);
        proyecto.addParqueInfantil(buenavista1);

        proyecto.addParqueInfantil(pijao2);
        proyecto.addParqueInfantil(cordoba2);
        proyecto.addParqueInfantil(buenavista2);

        Collection<Parque> listaEsperada = List.of(cordoba1, cordoba2, buenavista1, buenavista2, pijao1, pijao2);

        assertIterableEquals(listaEsperada, proyecto.getParquesOrdenValorAscendete());

        LOG.info("Finalizando test OrdenPorValor");
    }

}


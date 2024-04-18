package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class ZonaTest {

    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());


    /**
    * Metodo de prueba para calcular el valor de una zona circular
    */
   @Test
   public void valorZonaCircularArena() {
      LOG.info("Iniciado test valorZonaCircularArena");

      Zona zona = new Zona("Zona1", Material.ARENA, new Circulo(10));

      assertEquals(3141592.65, zona.calcularCosto(), App.PRECISION);

      LOG.info("Finalizando test valorZonaCircularArena");
   }

   /**
    * Metodo de prueba para calcular el valor de una zona cuadrado
    */
    @Test
    public void valorZonaCuadradoGramaNatural() {
       LOG.info("Iniciado test valorZonaCuadradoGramaNatural");
 
       Zona zona = new Zona("Zona1", Material.GRAMANATURAL, new Cuadrado(10));
 
       assertEquals(2000000, zona.calcularCosto(), App.PRECISION);
 
       LOG.info("Finalizando test valorZonaCuadradoGramaNatural");
    }
    
}

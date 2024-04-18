package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class CuadradoTest {

    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
    * 
    */
   @Test
   public void areaCuadradoLadoPositivo() {
      LOG.info("Iniciado test areaCuadradoLadoPositivo");

      Cuadrado cuadrado = new Cuadrado(10);
      assertEquals(100, cuadrado.calcularArea());

      LOG.info("Finalizando test areaCuadradoLadoPositivo");
   }

    /**
    * 
    */
    @Test
    public void areaCuadradoLadoNegativo() {
       LOG.info("Iniciado test areaCuadradoLadoNegativo");
 
       assertThrows(Throwable.class, ()-> new Cuadrado(-10));
 
       LOG.info("Finalizando test areaCuadradoLadoNegativo");
    }


    
    
}

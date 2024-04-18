package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class TrianguloTest {

    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
    * 
    */
   @Test
   public void areaTrianguloPositivo() {
      LOG.info("Iniciado test areaTrianguloPositivo");

      Triangulo triangulo = new Triangulo(10, 20);
      assertEquals(100, triangulo.calcularArea());

      LOG.info("Finalizando test areaTrianguloPositivo");
   }



    
}

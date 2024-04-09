package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class CirculoTest {
   private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

   /**
    * 
    */
   @Test
   public void areaCirculoPositivo() {
      LOG.info("Iniciado test areaCirculoPositivo");
      Circulo circulo = new Circulo(-10);
      assertEquals(314.1592653589793, circulo.calcularArea());
      LOG.info("Finalizando test areaCirculoPositivo");
   }


   /**
    * 
    */
    @Test
    public void areaCirculoNegativo() {
       LOG.info("Iniciado test areaCirculoNegativo");
       
       assertThrows(Throwable.class, ()-> new Circulo(-10));

       LOG.info("Finalizando test areaCirculoNegativo");
    }

}

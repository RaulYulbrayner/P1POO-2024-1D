package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class RectanguloTest {

    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
    * 
    */
   @Test
   public void areaRectanguloPositivo() {
      LOG.info("Iniciado test areaRectanguloPositivo");
      Rectangulo rectangulo = new Rectangulo(10, 20);
      assertEquals(200, rectangulo.calcularArea());
      LOG.info("Finalizando test areaRectanguloPositivo");
   }

    /**
    * 
    */
    @Test
    public void areaRectanguloNegativo() {
       LOG.info("Iniciado test areaRectanguloNegativo");

       Rectangulo rectangulo = new Rectangulo(-10, 20);
       
       assertThrows(Throwable.class, ()-> rectangulo.calcularArea());

       LOG.info("Finalizando test areaRectanguloNegativo");
    }
    
}

package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class QuizTest {
     private static final Logger LOG = Logger.getLogger(CuentaAhorroTest.class.getName());

    @Test
    public void contarConsonantes() {
        LOG.info("Iniciado test contarConsonantes");

        String palabra = "yulbraynner";

        assertEquals(8, App.cantidadVocales(palabra));
        
        LOG.info("Finalizando test contarConsonantes");
    }
    
}

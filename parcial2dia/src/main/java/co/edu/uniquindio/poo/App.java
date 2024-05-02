package co.edu.uniquindio.poo;

import java.util.Arrays;

public class App {

    public static boolean isVocal(char letra) {
        boolean centinela = false;
        if (letra == 'a' && letra == 'e' && letra == 'i' && letra == 'o' && letra == 'u') {
            centinela = true;
        }
        return centinela;
    }

    public static int cantidadVocales(String palabra) {
        int canitidad = 0;
        for (int i = 0; i <= palabra.length() - 1; i++) {
            char letra = palabra.charAt(i);
            if (!isVocal(letra)) {
                canitidad += 1;
            }
        }
        return canitidad;
    }

    public static void main(String[] args) {
        String nombre = "yulbraynner";
        int canitidad = cantidadVocales(nombre);
        System.out.println("La cantidad de palabras son: " + canitidad);
    }

}

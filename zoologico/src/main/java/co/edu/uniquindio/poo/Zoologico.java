package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Zoologico {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 8) {
            System.out.println("1. Añadir Animal");
            System.out.println("2. Mostrar todos los Animales");
            System.out.println("3. Hacer sonidos");
            System.out.println("4. Información de un animal");
            System.out.println("5. Dormir");
            System.out.println("6. Comer");
            System.out.println("7. Eliminar Animal");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Animal.agregarAnimal();
                    break;
                case 2:
                    Animal.mostrarAnimales();
                    break;
                case 3:
                    hacerSonido();
                    break;
                case 4:
                    Animal.mostrarInfoAnimal();
                    break;
                case 5:
                    dormir();
                    break;
                case 6:
                    comer();
                    break;
                case 7:
                    Animal.eliminarAnimal();
                    break;
                case 8:
                    System.out.println("Chao muchachos...");
                    break;
            }
        }
        scanner.close();
    }

    /**
     * Metodo que permite saber el sonido que hace un animal
     */
    private static void hacerSonido() {
        for (Animal animal : Animal.getAnimales()) {
            animal.hacerSonido();
        }
    }

    /**
     * Metodo que permite saber como duerme un animal
     */
    private static void dormir() {
        for (Animal animal : Animal.getAnimales()) {
            animal.dormir();
        }
    }

    /**
     * Metodo que permite saber como come un animal
     */
    private static void comer() {
        for (Animal animal : Animal.getAnimales()) {
            animal.comer();
        }
    }

}

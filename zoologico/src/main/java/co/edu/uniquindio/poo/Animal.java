package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Scanner;

public abstract class Animal {

    public String nombre, color;
    public int edad;
    private static LinkedList<Animal> animales = new LinkedList<>();

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo que permite definir el sonido específico de cada tipo de animal
     */
    public abstract void hacerSonido();

    /**
     * Metodo que permite definir específicamente como duerme cada tipo de animal
     */
    public abstract void dormir();

    /**
     * Metodo que permite definir específicamente como come cada tipo de animal
     */
    public abstract void comer();

    /**
     * Metodo constructor de la clase animal
     * @param nombre
     * @param color
     * @param edad
     */
    public Animal(String nombre, String color, int edad){
        this.nombre=nombre;
        this.color=color;
        this.edad=edad;
    }

    /**
     * Metodo toString de la clase animal
     */
    public String toString(){
        return "Nombre: " + nombre + " Color " + color + " Edad: " + edad;
    }

    /**
     * Metodo que permite agregar animales
     */
    public static void agregarAnimal() {
        System.out.println("Tipos de animal: 1.Perro    2.Gato    3.Pato");
        
        System.out.print("Seleccione tipo de animal: ");
        int tipo = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Nombre del animal: ");
        String nombre = scanner.nextLine();

        System.out.print("Color del animal: ");
        String color = scanner.nextLine();

        System.out.print("Edad del animal: ");
        int edad = scanner.nextInt();

        switch (tipo) {
            case 1:
                animales.add(new Perro(nombre, color, edad));
                break;
            case 2:
                animales.add(new Gato(nombre, color, edad));
                break;
            case 3:
                animales.add(new Pato(nombre, color, edad));
                break;
            default:
                System.out.println("Tipo de animal no válido");
                break;
        }
    }

    /**
     * Metodo que permite mostrar los animales que estan en la lista de animales
     */
    public static void mostrarAnimales() {
        for (Animal animal : animales) {
            System.out.println(animal);
        }
    }

    /**
     * Metodo que permite mostrar la información de un animal por medio de su nombre
     */
    public static void mostrarInfoAnimal() {
        scanner.nextLine();
        System.out.print("Ingrese el nombre del animal: ");
        String nombre = scanner.nextLine();
        for (Animal animal : animales) {
            if (animal.nombre.equals(nombre)) {
                System.out.println(animal);
                break;
            }
        }
    }

    /**
     * Metodo que permite eliminar animales de una lista
     */
    public static void eliminarAnimal() {
        scanner.nextLine();
        System.out.print("Ingrese el nombre del animal que quiere eliminar: ");
        String nombre = scanner.nextLine();
        for (Animal animal : animales) {
            if(animal.getNombre().equals(nombre)){
                animales.remove(animal);
            }
        }
    }

    /**
     * Metodo que permite obtener la lista de animales
     * @return
     */
    public static LinkedList<Animal> getAnimales() {
        return animales;
    }

    /**
     * Metodo que permite obtener el nombre de un animal
     * @return
     */
    public String getNombre() {
        return nombre;
    }

}

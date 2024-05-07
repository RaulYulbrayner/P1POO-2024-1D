package co.edu.uniquindio.poo;

public class Granja {
    
    public static void main(String[] args) {
        
        Animal[] arregloAnimales = new Animal[5];
        arregloAnimales[0] = new Perro();
        arregloAnimales[1] = new Gato();
        arregloAnimales[2] = new Pato();
        arregloAnimales[3] = new Perro();
        arregloAnimales[4] = new Pato();

        for (Animal animal : arregloAnimales) {
            animal.hacerSonido();
        }

    }

}

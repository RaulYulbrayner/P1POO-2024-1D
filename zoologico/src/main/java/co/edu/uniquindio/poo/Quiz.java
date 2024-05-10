package co.edu.uniquindio.poo;

public class Quiz {

    public static void main(String[] args) {
        int[] arreglo = { 34, 7, 23, 32, 5, 62, 1 };
        ordenar(arreglo);
        System.out.println("Arreglo ordenado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }

    public static void ordenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMin]) {
                    indiceMin = j;
                }
            }
            int temp = arreglo[indiceMin];
            arreglo[indiceMin] = arreglo[i];
            arreglo[i] = temp;
        }
    }

}
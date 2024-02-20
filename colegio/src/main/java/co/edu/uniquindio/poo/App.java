package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {



    public static double calculadora(int num1, int num2, char operador){
        int resultado = 0;
        if(operador == '+'){
            resultado = num1 + num2;
        }else if(operador == '-'){
            resultado = num1 - num2;
        }else if(operador == '*'){
            resultado = num1 * num2;
        }else if(operador == '/'){
            resultado = num1 / num2;
        }
        return resultado;
    }


    public static void main(String[] args) {
        String palabra = "El resultado es: ";
        double valorCalculadora = calculadora(5, 4, '*');
        System.out.println(palabra + valorCalculadora);
    }
}

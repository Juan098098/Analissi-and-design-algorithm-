package algoritmocuantitativo;

import java.util.Scanner;


public class AlgoritmoCuantitativo {
//Metod para vaalidar si un String esta conformado por solo numeros enteros
    private static boolean esNumerico(String cadena) {
        try {
            //Si permite convertir el String en entero el valor del String es
            //solo numerico y retornara true 
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            //Si salta la excepcion retornara false
            return false;
        }
    }

    public static void main(String[] args) {
        //Creamos un objeto de la misma clase para poder usar el metodo
        AlgoritmoCuantitativo validar = new AlgoritmoCuantitativo();
        //Creamos un objeto de tipo scanner para poder leer datos de entrada
        Scanner sc = new Scanner(System.in);
        String a, b;
        //Recoleccion los datos
        System.out.println("Digite a");
        a = sc.nextLine();
        System.out.println("Digite b");
        b = sc.nextLine();
        //Impimir la forma factorizada de los datos sin importar si es variable o entero
        System.out.println(a + "^2+2*" + a + "*" + b + "+" + b + "^2");
        //LLamando al metodo en el condicional en caso de que ambas partes del binomio sean enteras imprimira el resultado
        if ((validar.esNumerico(a)) && (validar.esNumerico(a))) {
            int aEntero = Integer.parseInt(a);
            int bEntero = Integer.parseInt(b);
            int respuesta = (aEntero + bEntero);
            System.out.println("=" + Math.pow(respuesta, 2));
        }

    }

}

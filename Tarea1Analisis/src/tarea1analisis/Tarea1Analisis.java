package tarea1analisis;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Tarea1Analisis {
    public static void main(String[] args) {
        /**
         * Objeto para definir la cantidad de decimales para mostrar de una
         * variable el parametro de entrada permite definnir la cantidad de
         * decimales a motrar representandolos en 0 en este caso se mostraran 3
         * decimales entonces se usan tres 0 es decir #.000
         */
        DecimalFormat obj = new DecimalFormat("#.000");
        Scanner entrada = new Scanner(System.in);

        /**
         * t es el tiempo ingresado por el usuario v es l velocidad media
         * ingresada por el usuario x representa la distancia recorrida
         * dependiendo de la multiplicacion del tiempo y la velocidad promedio
         */
        int x, t, v;
        try {
            //Se piden los datos de entrada al usuario:
            System.out.println("Ingrese el tiempo que duro el viaje (en horas)");
            t = entrada.nextInt();
            System.out.println("ingrese la velocidad media del viaje (en Km/h)");
            v = entrada.nextInt();
            //x es la multimplicacion de el tiempo por la velocidad promedio
            x = t * v;
            /**
             * L es la cantidad de litros consumida dependiendo el teimpo y la
             * velocidad media ingresados por el usuario, L es hallada por la
             * distancia dividido en 12Km/L
             */
            // la creacion de X2 permite convertir la variable x la cual es entera en double
            double x2 = (double) x;
            // x2 es igual a x pero en valor con decimales
            double L = x2 / 12;
            /**
             * para poder imprimir el numero con solo 3 decimales se llama al
             * objeto DecimalFormat instaniado anterior mente y ya listo para
             * solo imprimir 3 decimales
             */
            System.out.println(obj.format(L) + " Litro(s) fueron necesarios para el viaje");

        } catch (Exception InputMismatchException) {
            System.out.println("Debe ingresar solo numeros enteros");
        }
    }
}

package tarea2analisis;
import java.util.Scanner;
public class Tarea2Analisis {
    public static void main(String[] args) {
        /**
         * Declaracion de las entradas donde a, b, c seran los numeros
         * correspondientes en la ecuacion: aX^2 + bX + c = 0 a no debe ser
         * igual a 0
         */
        float a, b, c;
         // objeto para permitir la entrada de datos
        Scanner entrada = new Scanner(System.in);
         //Lectura de datos ingresados por el ususario
        try {
            System.out.println("a");
            a = entrada.nextFloat();
            System.out.println("b");
            b = entrada.nextFloat();
            System.out.println("c");
            c = entrada.nextFloat();

            /**
             * Condicional para verificar que a es diferente de 0 si es igual a
             * 0 imprimira "Impossivel calcular". si no resolvera la parte
             * interna de la raiz (-b^2 - 4ac)
             */
            if (a == 0) {
                System.out.println("Impossivel calcular");
            } else {
                double raiz = Math.pow(b, 2) - 4 * a * c;
                /**
                 * Condicional para verificar que la parte interna de la raiz no
                 * sea negativo si es negativo imprimira "Impossivel calcular"
                 * si no completara la fórmula de Bhaskara dando como resultado
                 * la parte negativa y positiva
                 */
                if (raiz < 0) {
                    System.out.println("Impossivel calcular");
                } else {
                    double R1 = (-b + Math.sqrt(raiz)) / (2 * a);
                    double R2 = (-b - Math.sqrt(raiz)) / (2 * a);
                    System.out.println(R1);
                    System.out.println(R2);
                }
            }
        } catch (Exception InputMismatchException) {           
              //Excepcion que evita el ingreso de caracteres no numericos            
            System.out.println("Solo puede ingresar datos de tipo numerico");
        }
    }
}

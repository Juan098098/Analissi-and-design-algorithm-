package Ejemplos;

import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args) {
        //Bubble Sort -> ORdenamiento Burbuja
        int tamano;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digitte la longitud del vector");

        tamano = entrada.nextInt();

        int ArrayN[] = new int[tamano];

        for (int i = 0; i < ArrayN.length; i++) {
            System.out.println("Digite el numero para el elemento " + (i + 1) + " : ");
            ArrayN[i] = entrada.nextInt();
        }
        /**
         * Metodo para mostrar el arreglo desardonado
         */
        System.out.println("************************* Sin Ordenar **********************");
        mostrarArreglo(ArrayN);
        System.out.println("¿Quiere ordenar el arreglo? S/N");
        String respuestaUsuario = entrada.next();
        //Si a respuesta "S" = si
        if (respuestaUsuario.equalsIgnoreCase("S")) {
            System.out.println("********* ORDENADO ***********");
            
            bubbleSort(ArrayN);

        }

    }

    private static void mostrarArreglo(int[] ArrayN) {
        System.out.println("|-----------------------|");
        //Ciclo array desde 0 hasta array.length
        for (int i = 0; i < ArrayN.length; i++) {
            System.out.println("Elemento " + (i + 1) + "------->" + ArrayN[i] );
        }
        System.out.println("|-----------------------|");
    }
//Burbuja, compara de aparejas, recorre el vector todas las veces necessarias para comparar todas las parejas
    private static void bubbleSort(int[] ArrayN) {
        for (int i = 0; i < ArrayN.length - 1; i++) {
            for (int j = 0; j < ArrayN.length - 1; j++) {
                //Pregunta
                if (ArrayN[j] > ArrayN[j + 1]) {
                    int temp = ArrayN[j + 1];
                    ArrayN[j + 1] = ArrayN[j];
                    ArrayN[j] = temp;
                }
            }

        }
        mostrarArreglo(ArrayN);
    }
    
    //Insercion compara hacia atras coge el posicion 3 y conpara con el 1 y 2, luego pasa al sigueinte y compara 4 con 3 2 y 1 y asi sucesivamente
    //Ordenamiento rapido, pero utilza muchos recursos
    
    //Seleccion insrcion, rapido
}

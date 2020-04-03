package algoritmodebusqueda;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgoritmoDeBusqueda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedir datos al ususario
        int a, b, c, d, e;
        System.out.println("Digite un numero");
        a = sc.nextInt();
        System.out.println("Digite un numero");
        b = sc.nextInt();
        System.out.println("Digite un numero");
        c = sc.nextInt();
        System.out.println("Digite un numero");
        d = sc.nextInt();
        System.out.println("Digite un numero");
        e = sc.nextInt();
        int[] vector = {a, b, c, d, e};
        System.out.println("Digite un numero para buscar cuantas veces se repite");
        int f = sc.nextInt();
        int contador = 0;
        //busqueda en el vector, si encuentra coincidencia al recorrerlo se aumentara el contador
        for (int i = 0; i < vector.length; i++) {
            if (f == vector[i]) {
                contador = contador + 1;
            }
        }
        if (contador > 0) {
            System.out.println("El numeroo " + f + " esta " + contador + " veces");
        } else {
            System.out.println("El numeroo " + f + " no esta en el vector");
        }
    }
}

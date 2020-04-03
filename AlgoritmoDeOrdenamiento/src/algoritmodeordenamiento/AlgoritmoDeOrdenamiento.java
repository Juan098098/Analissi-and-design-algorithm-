package algoritmodeordenamiento;
import java.util.Scanner;
public class AlgoritmoDeOrdenamiento {
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
        int aux;
        //For encargado de recorrer posiciones del vector
        for (int i = 0; i < vector.length; i++) {
            //For que dependiendo el valor del for anterior hara un segundo recorrido
            for (int j = 0; j < vector.length; j++) {
                //If que vera cual numero es menor
                if (vector[i] < vector[j]) {
                    //El auxiliar guardara el valor de el vector en i
                    aux=vector[i];
                    //intercambiara i con j
                    vector[i] = vector[j];
                    //Asigna el valor que habia en i a j
                    vector[j]= aux;
                }
            }
        }
        //Imprime el vector ordenado
        System.out.println("Vector ordenado:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        
       
    }
}

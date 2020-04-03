package tareaanalisis3_1;
import java.util.Scanner;
public class TareaAnalisis3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, N, aux = 0;
        System.out.println("Digite el numero a");
        a = sc.nextInt();
        System.out.println("Digite el numero N");
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            aux = a + (a + 1);
        }
        System.out.println(aux);
    }
}

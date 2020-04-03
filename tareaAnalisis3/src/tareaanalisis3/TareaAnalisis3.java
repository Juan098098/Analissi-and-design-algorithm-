package tareaanalisis3;
import java.util.Scanner;
public class TareaAnalisis3 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int entrada;
        do{
        System.out.println("Digite un numero");
        entrada = intro.nextInt();
        for (int x = 1; x <= entrada; x++){
            if (x==entrada){
                System.out.println(x + " ");
            }else{
                System.out.print(x + " ");
            }
        }       
        }while(entrada !=0);
    }  
}

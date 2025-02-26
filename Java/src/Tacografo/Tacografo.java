package Tacografo;
import java.util.*;

public class Tacografo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int[] mult = new int[valor];
        for(int i = 0; i < valor; i++){
            int valor1 = sc.nextInt();
            int valor2 = sc.nextInt();

            mult[i] = valor1*valor2;
        }
        int multi = 0;
        for(int i = 0; i < valor; i++){
             multi += mult[i];
        }

        System.out.println(multi);

    }
}

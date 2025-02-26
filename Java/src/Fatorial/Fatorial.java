package Fatorial;
import java.util.*;

public class Fatorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int fatorial = 1;
        for(int i = valor; i >= 1; i--){
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}

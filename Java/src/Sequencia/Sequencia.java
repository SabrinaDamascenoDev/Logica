//Beecrowd
package Sequencia;
import java.util.*;

public class Sequencia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numerosDeValores = sc.nextInt();
        int valores[] = new int[numerosDeValores];

        for(int i = 0; i < numerosDeValores; i++){
            valores[i] = sc.nextInt();
        }
        int podemSerMarcados=0;
        for(int i = 0; i < numerosDeValores-1; i++){
            if(valores[i] != valores[i+1]){
                podemSerMarcados++;
            }
        }
        podemSerMarcados++;
        System.out.println(podemSerMarcados);

    }

}

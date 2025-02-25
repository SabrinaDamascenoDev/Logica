package Tea;

import java.io.IOException;
import java.util.Scanner;

public class Tea {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int[] valores = new int[5];

        for(int i= 0; i < 5; i++){
            valores[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < 5; i++){
            if(valores[i] == valor){
                count++;
            }
        }

        System.out.println(count);


    }

}



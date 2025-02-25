package Links;
import java.util.Scanner;

public class Links {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pessosAcessaramLinkCerto = sc.nextInt();

        for(int i = 0; i < 2; i++){
            pessosAcessaramLinkCerto *= 2;
        }

        System.out.println(pessosAcessaramLinkCerto);
    }
}

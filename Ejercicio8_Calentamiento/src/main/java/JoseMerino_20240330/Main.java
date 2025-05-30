package JoseMerino_20240330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingresa la cantidad de numeros naturales que quieres sumar");
            int num = sc.nextInt();

            if(num <= 0) {
                System.out.println("El numero no es valido");
            }
            else{
                int res = 0;
                for(int i = 0; i <= num; i++){
                    res += i;
                }
                System.out.println(res);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
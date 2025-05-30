package JoseMerino_20240330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Hello world!");

            System.out.println("Ingresa un numero");
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            sc.nextLine();

            if(num > 0){
                System.out.println("Tu numero es positivo");
            }
            else if(num < 0){
                System.out.println("Tu numero es positivo");
            }
            else {
                System.out.println("Tu numero es 0");
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
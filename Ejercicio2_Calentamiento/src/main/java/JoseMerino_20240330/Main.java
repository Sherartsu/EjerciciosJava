package JoseMerino_20240330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try {
           System.out.println("Hello world!");

           Scanner sc = new Scanner(System.in);
           System.out.println("Ingresa un numero");

           int num = sc.nextInt();
           sc.nextLine();

           if(num % 2 == 0){
               System.out.println("Tu numero es par");
           }
           else {
               System.out.println("Tu numero es impar");
           }
       } catch (Exception e) {
           System.out.println("Error: " + e);
       }
    }
}
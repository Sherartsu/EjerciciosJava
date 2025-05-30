package JoseMerino_20240330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingresa la tabla del numero que quieres saber");
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();

            for(int i = 0; i <= 10; i++){

                System.out.println(num + " X " + i =);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
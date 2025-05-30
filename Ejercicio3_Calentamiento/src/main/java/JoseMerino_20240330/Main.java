package JoseMerino_20240330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hello world!");
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Qué operación quieres realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");

            int opc = sc.nextInt();

            System.out.println("Ingresa el primer numero");
            double num1 = sc.nextDouble();

            System.out.println("Ingresa el segundo numero");
            double num2 = sc.nextDouble();

            switch (opc){
                case 1:
                    System.out.println("Resultado = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Resultado = " + (num1 / num2));
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
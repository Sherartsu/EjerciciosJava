package JoseMerino_20240330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido al sistema de notas");

            System.out.println("Ingresa la primer nota del estudiante");
            double nota1 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ingresa la segunda nota del estudiante");
            double nota2 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ingresa la tercer nota del estudiante");
            double nota3 = sc.nextDouble();
            sc.nextLine();

            double promedio = (nota1 + nota2 + nota3) / 3;

            if(promedio >= 6 && promedio <= 10){
                System.out.println("El estudiante aprobo con una nota de: " + promedio);
            }  else if (promedio >= 0 && promedio < 6){
                System.out.println("El estudiante reprobo con una nota de: " + promedio);
            } else {
                System.out.println("Promedio no valido");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
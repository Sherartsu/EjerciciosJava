package JoseMerino_20240330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingresa el numero para el dia de la semana");
            int num = sc.nextInt();

            String nombreDia;
            switch (num) {
                case 1:
                    nombreDia = "El dia es: Lunes";
                    break;
                case 2:
                    nombreDia = "El dia es: Martes";
                    break;
                case 3:
                    nombreDia = "El dia es: Miércoles";
                    break;
                case 4:
                    nombreDia = "El dia es: Jueves";
                    break;
                case 5:
                    nombreDia = "El dia es: Viernes";
                    break;
                case 6:
                    nombreDia = "El dia es: Sábado";
                    break;
                case 7:
                    nombreDia = "El dia es: Domingo";
                    break;
                default:
                    nombreDia = "Número inválido. Por favor, ingresa un número entre 1 y 7.";
                    break;
            }

            System.out.println(nombreDia);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
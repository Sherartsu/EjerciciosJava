package JoseMerino_20240330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa el nombre del producto");
            String nombre = sc.next();
            sc.nextLine();

            System.out.println("Ingresa el precio del producto");
            double precio = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ingresa el porcentaje de descuento");
            double descuento = sc.nextDouble();
            sc.nextLine();

            if(descuento <= 0 || descuento > 100){

                System.out.println("Descuento no valido");

            } else {

                double precioFinal = precio - ((descuento / 100) * precio);

                System.out.println("Producto: " + nombre);
                System.out.println("Precio normal: " + precio);
                System.out.println("Descuento: " + descuento + "%");
                System.out.println("Precio final: " + precioFinal);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de ventas realizadas: ");
        int cantidadVentas = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= cantidadVentas; i++) {
            System.out.print("Ingrese valor de la venta " + i + ": ");
            int venta = sc.nextInt();

            total += venta;
        }

        System.out.println("El total de ventas del día es: $" + total);

        sc.close();
    }
}
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de ventas realizadas en el día: ");
        int cantidadVentas = sc.nextInt();
        int totalVentas = 0;

        for (int i = 1; i <= cantidadVentas; i++) {
            System.out.print("Ingrese el valor de la venta " + i + ": ");
            int valorVenta = sc.nextInt();
            totalVentas += valorVenta;
        }

        System.out.println("El total de ventas del día es: $" + totalVentas);
        sc.close();
    }
}

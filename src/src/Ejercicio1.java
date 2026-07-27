import java.util.Scanner;

public class Ejercicio1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("SISTEMA DE CIERRE DE CAJA ");
            System.out.print("¿Cuántas ventas se realizaron en el día?: ");
            int cantidadVentas = scanner.nextInt();


            double totalVentas = 0;

            if (cantidadVentas > 0) {

                for (int i = 1; i <= cantidadVentas; i++) {
                    System.out.print("Ingrese el valor de la venta " + i + ": $");
                    double valorVenta = scanner.nextDouble();

                    if (valorVenta > 0) {
                        totalVentas = totalVentas + valorVenta;
                    } else {
                        System.out.println("Nota: Se ingresó un valor no válido (<= 0), no sumará al total.");
                    }
                }

                System.out.println("\n--");
                System.out.println("El total de ventas del día es: $" + (int)totalVentas);

            } else {
                System.out.println("La cantidad de ventas ingresada debe ser mayor a 0.");
            }

            scanner.close();
        }
    }


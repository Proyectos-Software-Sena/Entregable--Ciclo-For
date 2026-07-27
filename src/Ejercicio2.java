import java.util.Scanner;

public class Ejercicio2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("¿Cuántas piezas se van a revisar?: ");
            int cantidad = scanner.nextInt();

            int aprobadas = 0;
            int defectuosas = 0;

            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Ingrese el peso de la pieza " + i + " (en gramos): ");
                double peso = scanner.nextDouble();
                if (peso < 100 || peso > 120) {
                    defectuosas++;
                } else {
                    aprobadas++;
                }
            }

            System.out.println("Piezas aprobadas: " + aprobadas + ". Piezas defectuosas: " + defectuosas + ".");
            scanner.close();
        }
    }


import java.util.Scanner;

public class Ejercicio4 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("¿Cuántas calificaciones componen el módulo?: ");
            int cantidad = scanner.nextInt();

            double suma = 0;

            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Ingrese la nota " + i + " (0.0 a 5.0): ");
                double nota = scanner.nextDouble();
                suma += nota;
            }

            double promedio = suma / cantidad;
            String estado = (promedio >= 3.0) ? "Aprobado" : "No Aprobado";

            System.out.printf("Promedio: %.2f - Estado: %s\n", promedio, estado);
            scanner.close();
        }
    }
}

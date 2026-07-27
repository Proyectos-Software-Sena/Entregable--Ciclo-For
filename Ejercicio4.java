import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de calificaciones: ");
        int cantidad = sc.nextInt();
        double suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = sc.nextDouble();
            suma += nota;
        }

        double promedio = suma / cantidad;
        String estado = promedio >= 3.0 ? "Aprobado" : "No Aprobado";

        System.out.printf("Promedio: %.2f - Estado: %s%n", promedio, estado);
        sc.close();
    }
}

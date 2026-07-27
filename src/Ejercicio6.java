import java.util.Scanner;

public class Ejercicio6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad total de asistentes: ");
            int cantidad = scanner.nextInt();

            int menores = 0;
            int adultos = 0;

            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Ingrese la edad del asistente " + i + ": ");
                int edad = scanner.nextInt();
                if (edad < 18) {
                    menores++;
                } else {
                    adultos++;
                }
            }

            System.out.println("Menores: " + menores + " - Adultos: " + adultos);
            scanner.close();
        }
    }

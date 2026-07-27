import java.util.Scanner;

public class Ejercicio5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el monto fijo a ahorrar cada mes: ");
            double monto = scanner.nextDouble();
            System.out.print("Ingrese la cantidad de meses: ");
            int meses = scanner.nextInt();

            double acumulado = 0;

            for (int i = 1; i <= meses; i++) {
                acumulado += monto;
                System.out.println("Mes " + i + ": $" + (long)acumulado);
            }

            scanner.close();
        }
    }


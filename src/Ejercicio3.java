import java.util.Scanner;

public class Ejercicio3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad de lecturas de temperatura: ");
            int lecturas = scanner.nextInt();

            double maxTemperatura = Double.NEGATIVE_INFINITY;

            for (int i = 1; i <= lecturas; i++) {
                System.out.print("Ingrese la temperatura " + i + " (°C): ");
                double temp = scanner.nextDouble();
                if (temp > maxTemperatura) {
                    maxTemperatura = temp;
                }
            }

            System.out.println("La temperatura máxima registrada fue: " + maxTemperatura + "°C.");
            scanner.close();
        }
    }


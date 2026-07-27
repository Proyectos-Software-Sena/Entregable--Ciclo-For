import java.util.Scanner;

public class Ejercicio7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la Tasa de Cambio Representativa del Mercado (TRM): ");
            double trm = scanner.nextDouble();

            for (int usd = 1; usd <= 10; usd++) {
                double cop = usd * trm;
                System.out.println(usd + " USD = " + (long)cop + " COP");
            }

            scanner.close();
        }
    }


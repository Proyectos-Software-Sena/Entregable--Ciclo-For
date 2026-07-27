import java.util.Scanner;

public class Ejercicio10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad de términos N de la serie de Fibonacci: ");
            int n = scanner.nextInt();

            int a = 0, b = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(a + (i < n - 1 ? ", " : ""));
                int siguiente = a + b;
                a = b;
                b = siguiente;
            }

            System.out.println();
            scanner.close();
        }
    }


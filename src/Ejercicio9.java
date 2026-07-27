import java.util.Scanner;

public class Ejercicio9 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad inicial de bacterias: ");
            long poblacion = scanner.nextLong();
            System.out.print("Ingrese la cantidad de horas de proyección: ");
            int horas = scanner.nextInt();

            for (int i = 1; i <= horas; i++) {
                poblacion *= 2;
                System.out.println("Hora " + i + ": " + poblacion + " bacterias");
            }

            scanner.close();
        }
    }
}

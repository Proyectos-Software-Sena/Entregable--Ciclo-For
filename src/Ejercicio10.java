import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de términos: ");
        int n = sc.nextInt();

        int numero1 = 0;
        int numero2 = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(numero1);

            if (i < n) {
                System.out.print(", ");
            }

            int siguiente = numero1 + numero2;

            numero1 = numero2;
            numero2 = siguiente;
        }

        sc.close();
    }
}

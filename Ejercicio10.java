import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos de Fibonacci: ");
        int n = sc.nextInt();
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i < n ? ", " : ""));
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        sc.close();
    }
}

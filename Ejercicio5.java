import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto fijo a ahorrar cada mes: ");
        int monto = sc.nextInt();
        System.out.print("Ingrese la cantidad de meses: ");
        int meses = sc.nextInt();
        int acumulado = 0;

        for (int i = 1; i <= meses; i++) {
            acumulado += monto;
            System.out.println("Mes " + i + ": $" + acumulado);
        }
        sc.close();
    }
}

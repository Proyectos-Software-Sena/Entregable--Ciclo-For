import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de lecturas de temperatura: ");
        int lecturas = sc.nextInt();
        int maxTemp = Integer.MIN_VALUE;

        for (int i = 1; i <= lecturas; i++) {
            System.out.print("Ingrese la temperatura " + i + ": ");
            int temp = sc.nextInt();
            if (temp > maxTemp) {
                maxTemp = temp;
            }
        }

        System.out.println("La temperatura máxima registrada fue: " + maxTemp + "°C");
        sc.close();
    }
}


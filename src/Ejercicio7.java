import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la TRM del día: ");
        int trm = sc.nextInt();

        for (int dolar = 1; dolar <= 10; dolar++) {

            int pesos = dolar * trm;

            System.out.println(dolar + " USD = " + pesos + " COP");
        }

        sc.close();
    }
}

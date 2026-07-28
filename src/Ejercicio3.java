import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de lecturas: ");
        int cantidad = sc.nextInt();

        int maxima = Integer.MIN_VALUE;

        for(int i = 1; i <= cantidad; i++){

            System.out.print("Temperatura " + i + ": ");
            int temperatura = sc.nextInt();

            if(temperatura > maxima){
                maxima = temperatura;
            }
        }

        System.out.println("La temperatura máxima registrada fue: " + maxima + "°C");
    }
}

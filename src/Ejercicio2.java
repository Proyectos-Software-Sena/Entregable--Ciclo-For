import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de piezas: ");
        int piezas = sc.nextInt();

        int aprobadas = 0;
        int defectuosas = 0;

        for(int i = 1; i <= piezas; i++){

            System.out.print("Peso pieza " + i + ": ");
            int peso = sc.nextInt();

            if(peso >= 100 && peso <= 120){
                aprobadas++;
            }else{
                defectuosas++;
            }
        }

        System.out.println("Piezas aprobadas: " + aprobadas);
        System.out.println("Piezas defectuosas: " + defectuosas);
    }
}

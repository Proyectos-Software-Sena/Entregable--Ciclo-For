import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de asistentes: ");
        int asistentes = sc.nextInt();
        int menores = 0, adultos = 0;

        for (int i = 1; i <= asistentes; i++) {
            System.out.print("Ingrese la edad del asistente " + i + ": ");
            int edad = sc.nextInt();
            if (edad < 18) {
                menores++;
            } else {
                adultos++;
            }
        }

        System.out.println("Menores: " + menores + " - Adultos: " + adultos);
        sc.close();
    }
}


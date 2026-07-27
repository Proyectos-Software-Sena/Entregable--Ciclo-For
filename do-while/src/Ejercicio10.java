import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {

        int cantidad, fibonacci, primero, segundo;

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de términos de la serie de Fibonacci que desea generar:"));

        primero = 0;
        segundo = 1;

        for (int i = 1;
             i <= cantidad;
             i++) {

            System.out.print(primero);

            if (i < cantidad) {
                System.out.print(", ");
            }

            fibonacci = primero + segundo;
            primero = segundo;
            segundo = fibonacci;
        }
    }
}
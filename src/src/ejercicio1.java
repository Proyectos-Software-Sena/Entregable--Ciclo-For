import javax.swing.*;

public class ejercicio1 {
    public static void main(String[] args) {
        int numeroVentas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventas"));
        int total = 0;

        for (int i = 1; i <= numeroVentas; i++) {
            System.out.print("Ingrese el valor de la venta " + i + ": ");
            int valorVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la venta "));
            total += valorVenta;
        }
        System.out.println("El total de ventas del día es: $" + total);
    }
}

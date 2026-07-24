import javax.swing.*;

public class Ejercicio1 {
    static void main() {
        int ventasDia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de ventas del día:"));
        int totalVentas = 0;

        for (int i = 0; i < ventasDia; i++) {
            int valorVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la venta " + (i + 1) + ":"));
            totalVentas += valorVenta;
        }
        JOptionPane.showMessageDialog(null, "El total de ventas del día es: $" + totalVentas);
    }
}

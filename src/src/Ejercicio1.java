import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        int cantidadVentas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas del dia: "));
        int valorVenta;
        int total = 0;

        for (int i = 1; i <= cantidadVentas; i++) {

            valorVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la venta " + i));
            total = total + valorVenta;
        }
        JOptionPane.showMessageDialog(null, "El total de ventas del dia es: $" + total);
    }
}

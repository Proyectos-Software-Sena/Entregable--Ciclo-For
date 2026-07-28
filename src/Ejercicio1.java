import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        int cantidadVentas;
        int venta;
        int total = 0;

        cantidadVentas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas ventas se realizaron en el dia?"));

        for (int i  = 1; i <= cantidadVentas; i++) {
            venta = Integer.parseInt(JOptionPane.showInputDialog("ingrense el valor de la venta" + i + ":"));
            total = total + venta;
        }
        JOptionPane.showInputDialog(null, "el valor de ventas del dia es: $" + total);
        }
    }

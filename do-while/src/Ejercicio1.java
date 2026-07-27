import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        int cantidadVentas, venta, total;

        total = 0;
        cantidadVentas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de vetsas que hubo en el dia: "));

        for (int contador = 1;
             contador <= cantidadVentas;
             contador++) {

            venta = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la venta: "));
            total = total + venta;

        }
        JOptionPane.showMessageDialog(null, "El total de ventas del día es: " + total);

    }
}


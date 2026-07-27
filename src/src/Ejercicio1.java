import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args){
        int cantidadVentas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número total de cobros realizados:"));
        double totalIngresos = 0;

        for (int i = 1; i <= cantidadVentas; i++) {
            double valorVenta = Double.parseDouble(JOptionPane.showInputDialog("Monto de la compra " + i + ":"));
            totalIngresos = totalIngresos + valorVenta;
        }

        JOptionPane.showMessageDialog(null, "Recaudo total de la jornada: $" + totalIngresos);

    }
}

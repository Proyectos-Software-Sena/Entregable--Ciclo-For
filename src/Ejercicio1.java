import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("¿Cuántas ventas se realizaron en el día?");
        int cantidad = Integer.parseInt(input);

        double total = 0;

        for (int i = 1; i <= cantidad; i++) {
            String ventaInput = JOptionPane.showInputDialog("Valor de la venta " + i + ":");
            double venta = Double.parseDouble(ventaInput);
            total += venta;
        }

        JOptionPane.showMessageDialog(null, "El total de ventas del día es: $" + total);

        System.exit(0);
    }
}
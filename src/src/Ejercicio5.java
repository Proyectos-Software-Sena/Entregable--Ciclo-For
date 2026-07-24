import javax.swing.*;

public class Ejercicio5 {
    static void main() {
        int montoFijo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto fijo a ahorrar cada mes:"));
        int cantidadMeses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses de la proyección:"));
        int totalAcumulado = 0;

        for (int i = 1; i <= cantidadMeses; i++) {
            totalAcumulado += montoFijo;
            JOptionPane.showMessageDialog(null, "Mes " + i + ": $" + totalAcumulado);
        }
    }
}

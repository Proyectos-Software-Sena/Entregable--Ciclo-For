import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args){
        double ahorroMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar cada mes:"));
        int cantidadMeses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de meses a proyectar:"));

        double acumulado = 0;
        String reporte = "Proyección de ahorros:\n";

        for (int i = 1; i <= cantidadMeses; i++) {
            acumulado = acumulado + ahorroMensual;
            reporte = reporte + "Mes " + i + ": $" + acumulado + "\n";
        }

        JOptionPane.showMessageDialog(null, reporte);
    }
}

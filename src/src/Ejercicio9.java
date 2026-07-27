import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args){
        int bacterias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial de bacterias:"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de horas a proyectar:"));

        String reporte = "Proyección de crecimiento bacteriano:\n";

        for (int i = 1; i <= horas; i++) {
            bacterias = bacterias * 2;
            reporte = reporte + "Hora " + i + ": " + bacterias + " bacterias\n";
        }

        JOptionPane.showMessageDialog(null, reporte);
    }
}

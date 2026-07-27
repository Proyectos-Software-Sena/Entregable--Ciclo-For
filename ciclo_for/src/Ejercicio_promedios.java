import javax.swing.*;
public class Ejercicio_promedios {
    public static void main (String[] args){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de calificaciones del módulo:"));
        double suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota #" + i + " (0.0 a 5.0):"));
            suma += nota;
        }
                double promedio = suma / cantidad;
                String estado;
                if (promedio >= 3.0) {
                    estado = "Aprobado";
                } else {
                    estado = "No Aprobado";
                }
                JOptionPane.showMessageDialog(null, "Promedio: " + String.format("%.2f", promedio) + " - Estado: " + estado);
    }
}

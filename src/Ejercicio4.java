import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas calificaciones componen el módulo?"));
        double suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Nota " + i + " (0.0 - 5.0):"));
            suma += nota;
        }

        double promedio = suma / cantidad;
        String estado = (promedio >= 3.0) ? "Aprobado" : "No Aprobado";

        JOptionPane.showMessageDialog(null, "Promedio: " + promedio + " - Estado: " + estado);
    }
}
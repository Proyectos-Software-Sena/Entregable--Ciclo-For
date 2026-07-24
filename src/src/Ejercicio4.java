import javax.swing.*;

public class Ejercicio4 {
    static void main(String[] args) {
        int cantidadCalificacionesModulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de calificaciones del módulo:"));
        double sumaCalificaciones = 0;

        for (int i = 0; i < cantidadCalificacionesModulo; i++) {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación " + (i + 1) + ":"));
            sumaCalificaciones += calificacion;
        }
        double promedioCalificaciones = (sumaCalificaciones / cantidadCalificacionesModulo);
        if (promedioCalificaciones >= 3.0) {
            JOptionPane.showMessageDialog(null, "APROBADO");
        } else {
            JOptionPane.showMessageDialog(null, "NO APROBADO");
        }
    }
}

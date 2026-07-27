import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args){
        int cantidadNotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calificaciones a registrar:"));
        double sumaNotas = 0;

        for (int i = 1; i <= cantidadNotas; i++) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + i + " (de 0.0 a 5.0):"));
            sumaNotas = sumaNotas + nota;
        }

        double promedio = sumaNotas / cantidadNotas;
        String estado;

        if (promedio >= 3.0) {
            estado = "Aprobado";
        } else {
            estado = "No Aprobado";
        }

        JOptionPane.showMessageDialog(null, "Promedio: " + String.format("%.2f", promedio) + " - Estado: " + estado);
    }
}

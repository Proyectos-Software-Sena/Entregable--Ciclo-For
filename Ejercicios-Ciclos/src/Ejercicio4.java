import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] arg) {
        int notas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de notas"));
        double promedio = 0;
        double suma = 0;
        String estado = "";
        for (int i = 1; i <= notas; i++) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota"));
            suma = suma + nota;
        }
        promedio = suma / notas;
        if (promedio >= 3.0) {
            estado = "Aprobado";

        } else {
            estado = "No Aprobado";
        }
        JOptionPane.showMessageDialog(null, "su promedio es: " + promedio + "\n" + "estado: " + estado);
    }

}
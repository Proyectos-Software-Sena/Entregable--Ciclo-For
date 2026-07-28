import javax.swing.*;

public class ejercicio4 {
    public static void main(String[] args) {
        int calificaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de calificaciones"));
        double suma = 0;
        for (int i = 1; i <= calificaciones; i++) {
            double notas =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + i + ": "));
            suma += notas;

        }
        double promedio = suma/calificaciones;
        String estado = (promedio >= 3.0) ? "Aprobado" : "No Aprobado";
        System.out.println("Promedio: " + promedio + " - " + "Estado " + estado);
    }
}

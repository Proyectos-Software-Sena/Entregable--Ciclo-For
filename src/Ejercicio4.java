import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        int notas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas: "));
        double suma = 0;
        double promedio = 0;

        for (int i = 1; i <= notas; i++) {

            double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + i + " de (0.0 y 5.0):"));
            suma += nota;

        }
        promedio = suma / notas;

        if (promedio >= 3.0) {
            JOptionPane.showMessageDialog(null, "Promedio: " + promedio + "\nEstado: Aprobado");
        }else  {
            JOptionPane.showMessageDialog(null, "Promedio: " + promedio + "\nEstado: Reprobado");
        }

    }

}

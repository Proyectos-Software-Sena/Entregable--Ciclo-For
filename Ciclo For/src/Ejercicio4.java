import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int modulo = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de modulos"));
        double promedio = 0;
        double suma = 0;
        for (int i = 1; i <= modulo; i++) {
            double notas = Double.parseDouble(JOptionPane.showInputDialog("ingrese las notas "));
            suma = suma + notas;

        }
        promedio = suma / modulo;

        if (promedio >= 3.0) {
            JOptionPane.showMessageDialog(null, "Aprobado, el promedio es de:" + promedio);
        } else {
            JOptionPane.showMessageDialog(null, " reprobado el promedio es de:" + promedio);
        }
    }
}

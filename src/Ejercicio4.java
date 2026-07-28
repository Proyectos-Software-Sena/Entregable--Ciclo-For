import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int cantidadNotas;
        double nota;
        double suma = 0;
        double promedio;

        cantidadNotas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas calificaciones tiene el modulo?"));

        for (int i = 1; i <= cantidadNotas; i++) {
            nota = Double.parseDouble(JOptionPane.showInputDialog("ingrese su nota" + i + ":"));
            suma = suma + nota;
        }
        promedio = suma / cantidadNotas;

        if (promedio >= 3.0) {
            JOptionPane.showMessageDialog(null, "promedio:" + promedio + "/nEstado: aprobado");
        }else{
            JOptionPane.showMessageDialog(null, "promedio:" + promedio + "/nEstado: no aprobado");
        }
    }
}

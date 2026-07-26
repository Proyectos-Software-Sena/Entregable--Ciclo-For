import javax.swing.*;

public class Ejercicio4 {
    public static void main (String[] args){

        int cantidadNotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantas clificaciones compone el modulo"));
        double suma = 0;
        double nota;
        double promedio;

        for (int i= 1; i <=cantidadNotas; i++) {
            nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + i));
            suma = suma + nota;
        }
        promedio = suma / cantidadNotas;

        if (promedio >= 3.0) {
            JOptionPane.showMessageDialog(null, "Promedio: " + promedio + "\n Aprobado");
        }else{
            JOptionPane.showMessageDialog(null, "Promedio: " + promedio + "\n No Aprobado");

        }
    }
}

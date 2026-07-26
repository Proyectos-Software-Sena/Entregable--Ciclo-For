import javax.swing.*;

public class Ejercicio4 {
    public static void main (String[] args){

        int cantidadNoas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas calificaciones componen el modulo?"));
        double sumaNota = 0;
        for (int i = 1 ; i <= cantidadNoas; i++){
            double notaActual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + i + ":"));
            sumaNota = sumaNota + notaActual;
        }
        double promedio = sumaNota / cantidadNoas;

        if (promedio >= 3.0){

            JOptionPane.showMessageDialog(null,"Promedio " + promedio + "\nEstado: Aprobado" );

        }else{
            JOptionPane.showMessageDialog(null,"Promedio " + promedio + "\nEstado: No Aprobado" );
        }
    }
}

import javax.swing.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        int numeroNotas;
        double notas, promedio, sumaNotas;
        String aprobacion;

        numeroNotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuántas calificaciones componen el módulo: "));

        sumaNotas = 0;

        for (int contador = 1;
             contador <= numeroNotas;
             contador++) {

            notas = Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota entre 0.0 - 5.0 :"));
            sumaNotas = sumaNotas + notas;

        }
        promedio = sumaNotas / numeroNotas;

        if (promedio >= 3.0) {
            aprobacion = "Aprobado";
        } else {
            aprobacion = "No Aprobado";
        }
        JOptionPane.showMessageDialog(null, "Promedio:" + promedio + "- Estado: " + aprobacion);

    }
}

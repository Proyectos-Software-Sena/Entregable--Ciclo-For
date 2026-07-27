import javax.swing.*;

public class ejercicio4 {
    static void main(String[] args) {

        int cantidadNotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de calificaciones que componen el modulo: "));
        double valorNota;
        double promedio;
        double suma = 0;

        for (int i = 1; i <= cantidadNotas; i++) {

            valorNota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la nota " + i + "(0.0 a 5.0"));
            
                suma += valorNota;

        }
        promedio = suma / cantidadNotas;

        if(promedio >= 3.0){
            JOptionPane.showMessageDialog(null, "Promedio: " + promedio + "\nEstado: Aprobado");
        } else{
            JOptionPane.showMessageDialog(null, "Promedio: " + promedio + "\nEstado: No aprobado");
        }

    }
}

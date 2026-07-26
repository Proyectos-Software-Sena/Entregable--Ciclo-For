import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args){

        int numNotas = Integer.parseInt(JOptionPane.showInputDialog("cuantas notas componen el modulo?"));
        double promedio = 0;
        double total = 0;

        for (int i = 1; i <= numNotas; i++){

            double notas = Double.parseDouble(JOptionPane.showInputDialog("ingres las nota " +i));

            total = total+notas;

            promedio = total / numNotas;
        }

        if (promedio >= 3.0  && promedio < 5.0) {
            JOptionPane.showMessageDialog(null,promedio + " estado: aprobado");
        } else if (promedio < 3.0 && promedio > 0.0) {
            JOptionPane.showMessageDialog(null,promedio + " estado: no aprobado");
        }else {
            JOptionPane.showMessageDialog(null,"ingrese una nota valida");
        }
    }
}

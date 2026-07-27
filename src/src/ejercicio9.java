import javax.swing.*;

public class ejercicio9 {
    static void main(String[] args) {

        int numBacterias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial de bacterias: "));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas: "));

        for (int i = 1; i <= horas; i++) {

            numBacterias = numBacterias * 2;

            JOptionPane.showMessageDialog(null, "Hora " + i + ": " + numBacterias + " bacterias");
        }
    }
}

import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {

        int bacterias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de bacterias inicial: "));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas a proyectar: "));

        for (int i = 1; i <= horas; i++) {
            bacterias *= 2;
            JOptionPane.showMessageDialog(null, "Hora " + i + " : " + bacterias + " bacterias");
        }

    }
}

import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] arg) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de meses para el ahorro"));
        double ahorro = Double.parseDouble(JOptionPane.showInputDialog("ingrese cantidad de ahorro"));
        double suma = 0;
        for (int i = 1; i <= mes; i++) {
            suma = suma + ahorro;

            JOptionPane.showMessageDialog(null, "mes " + i + ": $" + suma); }

    }
}

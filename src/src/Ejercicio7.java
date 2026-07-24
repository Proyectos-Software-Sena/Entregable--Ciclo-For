import javax.swing.*;

public class Ejercicio7 {
    static void main() {

        double trm = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la TRM del día:"));
        String tabla = "";

        for (int i = 1; i <= 10; i++) {
            double total = i * trm;
            tabla += i + " USD = " + (int) total + " COP\n";
        }

        JOptionPane.showMessageDialog(null, tabla);
    }
}

import javax.swing.*;

public class ejercicio7 {
    static void main(String[] args) {

        double tasa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tasa de cambio representativo del mercado (TRM) del dia: "));
        double suma = 0;

        for (int i = 1; i <= 10; i++) {

            suma += tasa;

            JOptionPane.showMessageDialog(null, i + " USD = " + suma, "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

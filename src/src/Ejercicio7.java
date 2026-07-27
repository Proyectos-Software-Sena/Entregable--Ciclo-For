import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args){
        double trm = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor actual del dólar (TRM en COP):"));

        String tabla = "Tabla de conversión USD a COP:\n";

        for (int i = 1; i <= 10; i++) {
            double totalCop = i * trm;
            tabla = tabla + i + " USD = " + totalCop + " COP\n";
        }

        JOptionPane.showMessageDialog(null, tabla);
    }
}

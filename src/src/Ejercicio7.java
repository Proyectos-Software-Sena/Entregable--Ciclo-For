import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args){

        double tasaCambio;
        double conversion;
        String resultado = "";

        tasaCambio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la TRM del dia:"));

        for (int i = 1; i <= 10; i++){
            conversion = i * tasaCambio;
            resultado = resultado + 1 + "USD = $" + conversion + " COP\n";
        }
        JOptionPane.showMessageDialog(null,resultado);
    }
}

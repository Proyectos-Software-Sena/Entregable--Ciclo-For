import javax.swing.*;

public class ejercicio8 {
    static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("Ingrese una palabra o cadena de texto");
        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }
        JOptionPane.showMessageDialog(null, invertido);
    }
}

import javax.swing.*;
public class ejercicio8 {
    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Ingrese la palabra clave o cadena de texto");

        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }

        System.out.println("Token generado: " + invertida);
        JOptionPane.showMessageDialog(null, "Token generado: " + invertida);
    }
}

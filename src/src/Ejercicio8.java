import javax.swing.*;

public class Ejercicio8 {
    public static void main (String [] args ){

        String palabra = JOptionPane.showInputDialog("Ingrese una palabra");
        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {

            invertida = invertida + palabra.charAt(i);

        }
        JOptionPane.showMessageDialog(null, "Palabra invertida: " + invertida);
    }
}

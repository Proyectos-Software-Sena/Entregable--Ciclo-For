import javax.swing.*;

public class Ejercicio8 {
    public static void main (String[] args){

        String palabra = JOptionPane.showInputDialog("ingrese la palabra clave o cadena de texto");

        String invertido = "";

        for (int i = palabra.length() - 1; i >=0 ; i--){

            invertido = invertido + palabra.charAt(i);
        }
        JOptionPane.showMessageDialog(null,"mensaje invertido: " + invertido);
    }
}

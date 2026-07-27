import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args){

        String palabra = JOptionPane.showInputDialog("ingresa la palabra clave: ");
        String clave = "";

        for (int i = palabra.length() - 1;i >= 0; i--){

            clave += palabra.charAt(i);
        }
        JOptionPane.showMessageDialog(null,"la clave es: " + clave);
    }
}

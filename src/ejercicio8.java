import javax.swing.*;

public class ejercicio8 {
    public static void main(String[] args){
        String palabra= JOptionPane.showInputDialog("Ingrese una palabra");
        String invertida="";

        for (int i=palabra.length()-1; i >= 0; i--){
            invertida += palabra.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "Cadena invertida:" + invertida);
    }
}

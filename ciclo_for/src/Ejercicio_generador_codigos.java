import javax.swing.*;
public class Ejercicio_generador_codigos {
public static void main(String[] args){
    String palabra = JOptionPane.showInputDialog("Ingrese la palabra clave:");
    String invertida = "";
    for (int i = palabra.length() - 1; i >= 0; i--) {
        invertida += palabra.charAt(i);
    }
    JOptionPane.showMessageDialog(null, "La cadena invertida es: " + invertida);






}
}

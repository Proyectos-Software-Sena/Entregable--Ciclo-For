import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Ejercicio8 {
    public static void main(String[] args) {

        String contraseña = JOptionPane.showInputDialog("Ingrese una palabra clave o cadena de texto: ");
        String reves = "";

        for (int i = contraseña.length() - 1;
             i >= 0;
             i--) {
            reves = reves + contraseña.charAt(i);
        }

        JOptionPane.showMessageDialog(null, "La palabra invertida es: " + reves);
    }

}


import javax.swing.*;

public class Ejercicio8 {
    static void main() {
        // Entrada esperada: Solicitar una palabra clave o cadena de texto (ej. "SENA2026").
        //Salida esperada: La cadena de texto invertida usando un ciclo for de atrás hacia adelante.
        //Ejemplo: Entrada: SENA. Salida: ANES.

        String palabra = JOptionPane.showInputDialog("Ingrese una palabra clave:");
        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }

        JOptionPane.showMessageDialog(null, "Cadena invertida: " + invertida);
    }
}

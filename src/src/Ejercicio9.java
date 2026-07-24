import javax.swing.*;

public class Ejercicio9 {
    static void main() {
        int bacteriasIniciales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial de bacterias:"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas de proyección:"));
        int poblacion = bacteriasIniciales;
        String resultado = "";

        for (int i = 1; i <= horas; i++) {
            poblacion *= 2;
            resultado += "Hora " + i + ": " + poblacion + " bacterias\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}

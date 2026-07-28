import javax.swing.*;
public class ejercicio9 {
    public static void main(String[] args) {
        int inicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial de bacterias"));

        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas de proyección"));

        int poblacion = inicial;
        String resultado = "";

        for (int i = 1; i <= horas; i++) {
            poblacion *= 2;
            resultado += "Hora " + i + ": " + poblacion + " bacterias\n";
        }

        System.out.println(resultado);
        JOptionPane.showMessageDialog(null, resultado);
    }
}

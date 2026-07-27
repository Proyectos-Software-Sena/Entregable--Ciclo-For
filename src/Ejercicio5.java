import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        double ahorro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ahorro mensual:"));
        ;
        double acumulado = 0;
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses:"));
        String resultado = "";

        for (int i = 1; i <= meses; i++) {
            acumulado += ahorro;
            resultado += "Mes" + i + ": $" + acumulado + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}

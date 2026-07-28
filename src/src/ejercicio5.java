

import javax.swing.*;

public class ejercicio5 {
    public static void main(String[] args) {
        int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto fijo a ahorrar cada mes"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses de la proyección"));

        int acumulado = 0;
        String resultado = "";

        for (int i = 1; i <= meses; i++) {
            acumulado += monto;
            resultado += "Mes " + i + ": $" + acumulado + "\n";
        }
        System.out.println(resultado);
        JOptionPane.showMessageDialog(null, resultado);
    }
}



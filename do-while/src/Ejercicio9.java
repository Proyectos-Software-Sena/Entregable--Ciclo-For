import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {

        int bascterias, horas;

        bascterias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial de bacterias: "));
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas de proyección: "));

        for (int i = 1;
             i <= horas;
             i++) {

            bascterias = bascterias * 2;

            JOptionPane.showMessageDialog(null, "Hora " + i + ": "  + bascterias + " bacterias");

        }

    }
}

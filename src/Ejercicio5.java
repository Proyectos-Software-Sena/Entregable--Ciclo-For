import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {

        double ahorroMes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ahorro mensual fijo: "));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Cuantos meses quiere proyectar este ahorro: "));
        double acumulador = 0;

        for (int i = 1; i <= meses; i++) {
            acumulador = acumulador + ahorroMes;
            JOptionPane.showMessageDialog(null,"Mes" + i + ": $" + acumulador);
        }


    }
}

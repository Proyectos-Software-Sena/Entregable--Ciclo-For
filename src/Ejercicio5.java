import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int ahorroMensual;
        int meses;
        int acumulado = 0;

        ahorroMensual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto que va ahorrar cada mes:"));
        meses = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de meses:"));

        for (int i = 1; i <=meses; i++){
            acumulado = acumulado + ahorroMensual;
            JOptionPane.showMessageDialog(null, "mes" + i + ": $" + acumulado);
        }
    }
}

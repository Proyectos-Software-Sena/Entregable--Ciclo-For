import javax.swing.*;

public class ejercicio5 {
    static void main(String[] args) {

        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto fijo a ahorrar cada mes: "));
        int cantidadMeses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses de la proyeccion: "));
        double suma = 0;

        for (int i = 1; i <= cantidadMeses; i++) {

            suma += monto;

            JOptionPane.showMessageDialog(null, "Mes " + i + ": $" + suma);
        }
    }
}

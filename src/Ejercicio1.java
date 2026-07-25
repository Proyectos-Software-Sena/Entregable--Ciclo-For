import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

    int ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventas realizadas"));
    double total = 0;

    for (int i = 1; i <= ventas; i++) {

        double venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la venta" + i)) ;

        total = total + venta ;

    }

    JOptionPane.showMessageDialog(null, "El valor de la venta es: " + total);

    }
}

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args){
        int cantventas;
        int venta;
        int total = 0;
        cantventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuántas ventas hubieron"));
        for (int i = 1; i<= cantventas; i++){
            venta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la venta " + i));
            total = total + venta;
        }
        JOptionPane.showMessageDialog(null, "El total de ventas del día es: $" + total);
    }
}

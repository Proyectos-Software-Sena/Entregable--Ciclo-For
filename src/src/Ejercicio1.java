import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args){

        int cantidadVentas;
        double valorVenta;
        double total = 0;

        cantidadVentas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas ventas se realizaron en el dia?"));

       for (int i = 1; i <= cantidadVentas; i++){
           valorVenta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la venta #" + i + ":"));
           total = total + valorVenta;
       }

       JOptionPane.showMessageDialog(null,"El total de ventas del dia es: $" + total );
    }

}

import javax.swing.*;

public class Ejercico1 {
    public static void main (String[] args){
        //ver total de numero recaudado en el dia

        int cantidadVentas = Integer.parseInt(JOptionPane.showInputDialog("cuantas ventas se realizaron hoy?"));
        double total = 0;

        for (int i= 0; i < cantidadVentas; i++){
            double ventas = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valorde la venta " + i + ":"));
            total = total + ventas ;
        }
        JOptionPane.showMessageDialog(null,"el total de ventas del dia es : " + "$" + total);
    }
}

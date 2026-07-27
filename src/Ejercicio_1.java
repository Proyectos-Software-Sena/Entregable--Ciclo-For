import javax.swing.*;

public class Ejercicio_1 {
    public static void main (String[] args){

        int compra = Integer.parseInt(JOptionPane.showInputDialog("Cuantas compras hubo en el dia"));
        double suma = 0;
        for (int i = 1; i <= compra; i++){
            double precio = Double.parseDouble(JOptionPane.showInputDialog("De cuanto fue el total de la compra"));
            suma += precio;
        }
        System.out.println("la venta total fue: " + suma);
    }
}

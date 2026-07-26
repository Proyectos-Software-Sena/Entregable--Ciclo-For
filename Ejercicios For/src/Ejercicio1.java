import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args){

        int ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventas del dia: "));
        int total = 0;

        for (int i = 1; i <= ventas; i++){

                int precios = Integer.parseInt(JOptionPane.showInputDialog("De cuantos fueron las ventas? "));

                total = total + precios;
        }
        JOptionPane.showMessageDialog(null,"la venta del dia fue de: $" + total);
    }
}

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args){
       int ventas = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de ventas que se hicieron en el dia"));
       int total = 0;
       for(int i = 1; i <= ventas; i++) {

           int costo = Integer.parseInt(JOptionPane.showInputDialog("ingrese le valor de la venta"));

           total = total + costo;
       }
       JOptionPane.showMessageDialog(null, "el total de las ventas es de: " + total);
    }

}

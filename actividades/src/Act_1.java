import javax.swing.*;

public class Act_1 {
    public static void main (String[] args){

        int compra = Integer.parseInt(JOptionPane.showInputDialog("cuantas compras hubo en el dia"));
        double suma = 0;
        for (int i = 1; i <= compra; i++){
            double precio = Double.parseDouble(JOptionPane.showInputDialog("cunato fue la compre " + i));
            suma += precio;

        }
        System.out.println("la venta total fue: " + suma);
    }
}

import javax.swing.*;

public class ejercicio1 {
    public static void main (String[] args){

        int numVentas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantas ventas se realizaron en el dia: "));
        double valorVentas;
        double suma = 0;

        for (int i = 1; i <= numVentas; i++) {

            valorVentas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor " + i));

            suma += valorVentas;
        }
        JOptionPane.showMessageDialog(null, "El total de ventas del dia es: $" + suma);
    }
}

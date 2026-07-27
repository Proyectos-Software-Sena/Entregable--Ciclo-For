import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {

        int total = 0;
        int cantidadVentas;
        int valorVenta;


        String pp = JOptionPane.showInputDialog("Cuántas ventas se realizaron en el dia?");
        cantidadVentas = Integer.parseInt(pp);

        for(int i = 1; i <= cantidadVentas; i++) {
            pp = JOptionPane.showInputDialog("Ingrese el valor de la venta " + i );
            valorVenta = Integer.parseInt(pp);
            total = total + valorVenta;
        }

        JOptionPane.showMessageDialog(null, "El total de ventas del dia es: " + total);

    }
}
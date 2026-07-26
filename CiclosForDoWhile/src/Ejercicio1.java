import javax.swing.*;

public class Ejercicio1 {
    public static void main( String[] args) {

        int canventas,venta, totalVentas, i;

        totalVentas = 0;
        i= 1;

        canventas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de vetsas que hubo en el dia: "));

        do{
            venta= Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la venta: "));
            totalVentas = totalVentas + venta;
            i++;
        }while (i <= canventas);

        JOptionPane.showMessageDialog(null, "El total de ventas del día es: " + totalVentas);

    }
}
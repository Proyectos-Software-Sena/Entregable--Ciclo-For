import javax.swing.*;

public class Ejercicio1 {
    public static void main( String[] args) {

        int cantidadVentas,venta, total, contador;

        total = 0;
        contador= 1;

        cantidadVentas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de vetsas que hubo en el dia: "));

        do{
            venta= Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la venta: "));
            total = total + venta;
            contador++;
        }while (contador <= cantidadVentas);

        JOptionPane.showMessageDialog(null, "El total de ventas del día es: " + total);

    }
}


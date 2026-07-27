import javax.swing.*;

public class ejercicio1 {
    public static void main(String[] args){
        int cantidadVenta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas:"));
        int venta;
        int total=0;

        for (int i=1; i <= cantidadVenta; i++){
            venta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la venta:" + i));
            total = total + venta;
        }
        JOptionPane.showMessageDialog(null, "El total de ventas del dia es:" + total);
    }
}

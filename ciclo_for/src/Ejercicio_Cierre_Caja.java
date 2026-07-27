import javax.swing.*;
public class Ejercicio_Cierre_Caja {

public static void main(String[] args){
    int ven = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas ventas se realizaron hoy?"));
    int to = 0;

    for (int i = 1; i <= ven; i++) {
        int va = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la venta #" + i));
        to += va;
    }

    JOptionPane.showMessageDialog(null, "El total de ventas del día es: $" + to);
}

}

